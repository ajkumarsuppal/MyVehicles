package com.myVehicles.controller;

import javax.validation.Valid;

import com.myVehicles.model.User;
import com.myVehicles.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@Autowired
	UserServiceImpl userService;

	@GetMapping("/")
	public String homeRoute() {
		return "home";
	}

	@GetMapping("/register")
	public String registerRoute(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}

	@PostMapping("/register/new")
	public String userRegisterRoute(Model model, @Valid User user, BindingResult result) {
		if (result.hasErrors())
			return "registration";
		userService.saveUserDetails(user);
		return "redirect:/";
	}

	@GetMapping("/user/login")
	public String loginRoute() {
		return "login";
	}

	@PostMapping("/user/login")
	public String loginRouter(Model model, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		if (userService.loginValidator(username, password)) {
			return ("redirect:/user/" + username);
		} else {
			model.addAttribute("error", "Invalid Credentials");
			return "redirect:user/login";
		}
	}

}
