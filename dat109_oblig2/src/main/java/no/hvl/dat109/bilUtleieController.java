package no.hvl.dat109;

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
        
	
	@GetMapping("/")
	public String foersteBesoek(Model model) {
		
		//model.addAttribute("billiste", new Bil());
		//model.addAttribute("spillerkoe", spillerkoe);

		return "bil";
	}
	@GetMapping("/registrering")
	public String registreringSide(Model model) {
		return "brukerRegistrering";
	}
	@GetMapping("utleie")
	public String utleie(Model model) {
		return "leieSide";
	}
}
