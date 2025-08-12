package com.app.controller;

import com.app.entity.University;
import com.app.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping("/universityprofile")
    public String showUniversityProfileForm(Model model) {
        model.addAttribute("university", new University());
        return "universityprofile";
    }

    @PostMapping("/universityprofile")
    public String submitUniversityProfileForm(@ModelAttribute("university") University university) {
        universityService.createUniversityProfile(university);
        return "redirect:/universityprofile";
    }
    
}