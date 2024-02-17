package no.hvl.dat109;

import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class bilUtleieController {
        private Kunde kunde;
		@Autowired private BilService bs;
	
	@GetMapping("/")
	public String foersteBesoek() {
		 
		//model.addAttribute("kunde" , new kunde());
		//model.addAttribute("spillerkoe", spillerkoe);

		return "registerering";
	}
		@PostMapping("/")
		public String registreringSide(  Model model,  @ModelAttribute("Kunde") Kunde kunde   ) {
		model.addAttribute("kunde" ,new Kunde());
			
             
		return "redirect:leieut";
	}
	@GetMapping("/leieut")
	public String utleie(Model model) {
           
		return "leieut";
	}

      @PostMapping("/leieut")
           public String leiut(Model model,@RequestParam("hvormangedager") Integer hvormangedager,@RequestParam("startdato")Date startdato,@RequestParam("bil") String bil){
                        model.addAttribute("hvormangedager", hvormangedager);
						model.addAttribute("startdato", startdato);
					
						Bil valgtBil = bs.bilListe().stream()
						.filter(b -> b.getKategori().equals(bil))
						.findFirst()
						.orElse(null);
    
	double  samlepris =hvormangedager*Kategori.getPris(valgtBil.getKategori());
if (valgtBil != null) {
model.addAttribute("kunde", kunde);
model.addAttribute("bil", valgtBil);
return "redirect:/kvittering";
} else {
model.addAttribute("feilmelding", "Det oppstod en feil under bekreftelsen av reservasjonen. Vennligst prøv igjen.");
return "feilmelding";
}
	  
    }

	@GetMapping("/kvittering")
	public String kvitteringen(){
		return "kvittering";
	}
	

	
}
