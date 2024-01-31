package no.hvl.dat108.webshop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
public class helloWorldController {
	
	@Autowired private RuteService sr;
	private static List<Spiller> spillerliste = new ArrayList<Spiller>();
	private static Queue<Spiller> spillerkoe = new LinkedList<Spiller>();

	@GetMapping("/hello")
	@ResponseBody
	public String helloWorld() {
		return "Hello world";
	}
	
	@GetMapping("/")
	public String foersteBesoek(Model model,
			HttpServletRequest request
			) {
	   
		List<Rute> liste = sr.rutelist();
		model.addAttribute("ruteliste", liste);
		model.addAttribute("spiller", new Spiller());
		model.addAttribute("spillerliste", spillerliste);
		model.addAttribute("spillerkoe", spillerkoe);
		
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
		
		if(spillerliste.size() >=4 || spillerkoe.size() >=4) {
			ra.addFlashAttribute("ikkeLagtTil", "Kun plass til 4 spillere");
			
			return "redirect:";
		}
		
		spillerliste.add(spiller);
		spillerkoe.add(spiller);
		System.out.println("Lagt til spiller:" + spiller.getNavn());
	
		
		ra.addFlashAttribute("lagtTil", "Spiller lagt til");
		
		return "redirect:";
	}
	
	public void spillTrekk(Queue<Spiller> spillerliste) {
		Spiller spiller1 = spillerliste.remove();
		spiller1.Spilltrekk();
		spillerliste.add(spiller1);
	}

}
