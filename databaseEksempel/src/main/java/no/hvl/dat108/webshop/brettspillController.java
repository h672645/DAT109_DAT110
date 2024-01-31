package no.hvl.dat108.webshop;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class brettspillController {
	
	@Autowired private RuteService sr;
	private static Queue<Spiller> spillerkoe = new LinkedList<Spiller>();
	private static int tempterningkast;
	
	@GetMapping("/")
	public String foersteBesoek(Model model,
			HttpServletRequest request
			) {
	   
		List<Rute> liste = sr.rutelist();
		model.addAttribute("ruteliste", liste.stream().sorted((x, y) -> y.getRutenummer() - x.getRutenummer()).toList());
		model.addAttribute("spiller", new Spiller());
		model.addAttribute("spillerkoe", spillerkoe);
		
		//BARE FOR Å SLIPPE Å REGISTRERE SPILLERE HELE TIDEN UNDER TESTING
		if(spillerkoe.isEmpty()) {
			spillerkoe.add(new Spiller("Spiller1"));
			spillerkoe.add(new Spiller("Spiller2"));
		}
		
		
		if(!spillerkoe.isEmpty()) {
			model.addAttribute("hvemSinTur",spillerkoe.peek().getNavn());
		}
		
	    return "testbrett";
	}
	
	@PostMapping("/leggTilSpiller")
	public String leggTilSpiller(Model model,
			HttpServletRequest session,
			@ModelAttribute("deltager") Spiller spiller,
			RedirectAttributes ra
			) {
		
		if(spillerkoe.size() >=4) {
			ra.addFlashAttribute("ikkeLagtTil", "Kun plass til 4 spillere");
			
			return "redirect:";
		}
		
		spillerkoe.add(spiller);
		System.out.println("Lagt til spiller:" + spiller.getNavn());
		
		ra.addFlashAttribute("lagtTil", "Spiller lagt til");
		
		return "redirect:";
	}
	
	@PostMapping("/trillTerning")
	public String spillTrekk(Model model,
			RedirectAttributes ra
			) {
		Spiller spiller1 = spillerkoe.peek();
		tempterningkast = spiller1.Spilltrekk();
		System.out.println(tempterningkast);
		
		ra.addFlashAttribute("terningkast", tempterningkast);
		
		return "redirect:";
	}
	
	@PostMapping("/flyttBrikke")
	public String flyttBrikke(Model model,
			RedirectAttributes ra
			) {
		
		Spiller spiller1 = spillerkoe.remove();
		int startrute = spiller1.getRutelokasjon();
		
		if(tempterningkast == 0) {
			spiller1.setRutelokasjon(1);
		} else {
			spiller1.setRutelokasjon(startrute + tempterningkast);
		}
		
		List<Rute> liste = sr.rutelist();
		for(Rute rute : liste) {
			if(rute.getRutenummer() == spiller1.getRutelokasjon()) {
				ra.addFlashAttribute("stige/slange", rute.getRutenummer());
				ra.addFlashAttribute("flyttet", rute.getVerdi());
				System.out.println(rute.getRutenummer() + rute.getVerdi());
				spiller1.setRutelokasjon(spiller1.getRutelokasjon()+rute.getVerdi());
			}
		}
		
		spillerkoe.add(spiller1);
		
		return "redirect:";
	}
	
	public void spillTrekk(Queue<Spiller> spillerkoe) {
		Spiller spiller1 = spillerkoe.remove();
		int terningkast = spiller1.Spilltrekk();
		int startrute = spiller1.getRutelokasjon();
		spiller1.setRutelokasjon(startrute + terningkast);
		spillerkoe.add(spiller1);
	}

}
