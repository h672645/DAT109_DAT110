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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class helloWorldController {
	
	@Autowired private RuteService sr;

	@GetMapping("/hello")
	@ResponseBody
	public String helloWorld() {
		return "Hello world";
	}
	
	@GetMapping("/")
	public String liste(Model model) {
	   
		List<Rute> liste = sr.rutelist();

	    model.addAttribute("ruteliste", liste);
	    
		//tbd;
	    return "testbrett";
	}
	
	@PostMapping("/")
	public String spillTrekk(Model model, @RequestParam Queue<Spiller> ruteliste) {
		Spiller spiller1 = ruteliste.remove();
		spiller1.Spilltrekk();
		model.addAttribute(spiller1);
		ruteliste.add(spiller1);
		return "testbrett";
	}

}
