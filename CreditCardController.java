package codingtechniques.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import codingtechniques.model.CreditCard;
import jakarta.validation.Valid;

@Controller
public class CreditCardController { //t can handle HTTP requests.
	
	@GetMapping("/registration")//maps HTTP GET requests to /registration to this method.
	public String getRegPage(@ModelAttribute("creditCard") CreditCard creditCard) {
		return "register";
	}
	
	@PostMapping("/registration") //maps HTTP POST requests to /registration to this method.
	public String saveCard(@Valid CreditCard creditCard, Errors errors) {
		if (errors.hasErrors()) {
			return "register";
	}
		
		
		return "successPage";
	}
	}
