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
import org.springframework.validation.BindingResult;
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
	
	static List<Bil> bil_liste = new ArrayList<Bil>();
	static List<Reservasjon> reservasjoner = new ArrayList<Reservasjon>();
	
	static {
        bil_liste.add(new Bil("ABC123", "Treg", true));
        bil_liste.add(new Bil("DEF456", "Rask", true));
        bil_liste.add(new Bil("GHI789", "Liten", true));
        bil_liste.add(new Bil("JKL012", "Stor", true));
    }
	

	@GetMapping("/")
	public String startside(Model model) {
		
		model.addAttribute("bilnummer", new String());
		model.addAttribute("hentenavn", new String());
		
		return "startside";
	}
	
	
	@GetMapping("/reserver")
	public String getResevering(Model model) {
		model.addAttribute("reservasjon", new Reservasjon());
		
		return "reservering";
	}
	
	@PostMapping("/reserver")
	public String leiebil(Model model,
			@ModelAttribute Reservasjon reservasjon,
			BindingResult bindingResult,
			RedirectAttributes ra) {

		if (bindingResult.hasErrors()) {
            // Handle validation errors
            return "reservering";
        }
		
		reservasjoner.add(reservasjon);
		model.addAttribute("reservasjon", reservasjon);
		
		return "kvittering";
	}
	
	@PostMapping("/hentbil")
	public String postHentbil(Model model,
			@ModelAttribute("hentenavn") int hentenavn,
			RedirectAttributes ra) {
		
		Reservasjon res = null;
		String e = "";
		
		if(reservasjoner == null) {
			return "startside";
		}
		
		for(Reservasjon s : reservasjoner) {
			if(s.getKredittkortnummer() == hentenavn) {
				res = s;
				e = s.getKategori();
			}
		}
		
		if(res == null) {
			return "startside";
		}
		
		if(bil_liste == null) {
			return "startside";
		}
		
		model.addAttribute("navn", res.getFornavn());
		String regNr = null;
		
		for(Bil bil : bil_liste) {
			if(bil.getKategori() == res.getKategori() && bil.erLedig()) {
				bil.setLedig(false);
				regNr = bil.getRegNr();
				model.addAttribute("regNr", regNr);
				
				switch(e) {
				case "Liten":
					model.addAttribute("pris", 10);
					break;
				case "Stor":
					model.addAttribute("pris", 100);
					break;
				case "Rask":
					model.addAttribute("pris", 500);
					break;
				case "Treg":
					model.addAttribute("pris", 50);
				}
				
				
				
			}
		}
		
		
		
		return "utlevert";
	}
	
	@PostMapping("/leverbil")
	public String postLeverBil(Model model,
			@ModelAttribute("bilnummer") String bilnummer,
			RedirectAttributes ra) {
		
		for(Bil bil : bil_liste) {
			if(bil.getRegNr() == bilnummer) {
				bil.erLedig();
			}
		}
		
		return "redirect:";
	}
	
	@GetMapping("/leverbil")
	public String leverBil(Model model) {
		
		
		return "startside:";
	}
	
	@GetMapping("/hentbil")
	public String getHentBil(Model model) {
		
		return "startside";
	}

}
