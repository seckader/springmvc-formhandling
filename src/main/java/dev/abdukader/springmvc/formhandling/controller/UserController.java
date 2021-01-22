package dev.abdukader.springmvc.formhandling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dev.abdukader.springmvc.formhandling.domain.User;

@Controller
public class UserController {
	
	private static final String MESSAGE = "User SignUp succesfully";
	private static final String FORM_VIEW = "signup-form";
	private static final String SUCCESS_VIEW = "signup-success";
	
	/**
	 * Create new User for empty form.
	 * 
	 * @return
	 */
	@ModelAttribute
	public User setUser() {
		return new User();
	}
	
	/**
	 * Method to show the initial HTML form.
	 * 
	 * @return
	 */
	@GetMapping("/form")
	public String showForm() {
		return FORM_VIEW;
	}
	
	/**
	 * Save user sign up form.
	 * 
	 * @param user
	 * @param model
	 * @return
	 */
	@PostMapping("/user")
	public String saveUser(@ModelAttribute User user, Model model) {
		
		model.addAttribute("message", MESSAGE);
		model.addAttribute("user", user);
		
		return SUCCESS_VIEW;
	}

}
