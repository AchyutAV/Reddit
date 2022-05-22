package com.achu.reddit_clone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String handle(Model model) {
        model.addAttribute("title", "Hello, Tymeleaf!");
        return "home";
    }
}