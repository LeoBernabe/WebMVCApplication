package com.lgeratech.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.lgeratech.demo.models.User;
@Controller
public class UserController {
	@GetMapping(value = "/registration")
	public String registration() {
		return "registration";
	}	
	@PostMapping(value = "/profile")
	public String profile(@ModelAttribute User user, Model model) {
		model.addAttribute("user", user);
		return "profile";
	}	
}