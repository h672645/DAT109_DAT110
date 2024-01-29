package no.hvl.dat108.webshop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class helloWorldController {

	@GetMapping("/hello")
	@ResponseBody
	public String helloWorld() {
		return "Hello world";
	}
	
	@GetMapping("/")
	public String liste(Model model) {
	    
		List<Rute> liste = new ArrayList<>();
	    for(int i = 1; i <= 100; i++) {
	        
	    	Rute rute = new Rute(i);
	    	
	    	Random random = new Random();
	    	if(i % 15 == 0) {
	    		rute.setVerdi(random.nextInt(5,10));
	    	} else if(i % 13 == 0) {
	    		rute.setVerdi(random.nextInt(-10,-5));
	    	} else {
	    		
	    	}
	    	
	    	liste.add(rute);
	        
	    }
	    
	    model.addAttribute("ruteliste", liste);
	    
	    return "testbrett";
	}
	
	@PostMapping("/SpillTrekk")
	public String spillTrekk(Model model
			) {
		
		
		
		return "deltagerlite";
	}

//hei fra ibrahiuhsiHWDIP

}
