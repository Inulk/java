package com.inu.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inu.test.model.User;
import com.inu.test.service.UserService;

@Controller
@RequestMapping(path="/users")
public class UserController { 
	
	@Autowired 
	UserService userService;
	
	@RequestMapping( method=RequestMethod.GET )
	public String allUsers(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("users", userService.findAll());
		return "users";
	}
	
	@RequestMapping(path="/save", method=RequestMethod.POST )
	public String saveUsers(Model model, @ModelAttribute User user) {
		System.out.println(user);
		
		userService.save(user);
		model.addAttribute("users", userService.findAll());
		return "redirect:/users";
	}
	
}
