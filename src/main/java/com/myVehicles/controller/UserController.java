package com.myVehicles.controller;

import com.myVehicles.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("user/{username}")
    public String userHomeRoute(Model model, @PathVariable String username) {
        model.addAttribute("username", username);
        return "user/home";
    }
}
