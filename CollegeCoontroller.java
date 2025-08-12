package com.app.controller;

import com.app.entity.College;

import com.app.service.CollegeService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class CollegeCoontroller {

    @Autowired
    private CollegeService collegeService;

    @GetMapping("/collegeprofile")
    public String showCollegeProfileForm(Model model) {
        model.addAttribute("college", new College());
        return "collegeprofile";
    }

    @PostMapping("/collegeprofile")
    public String submitCollegeProfileForm(@ModelAttribute("college") College college) {
    	collegeService.createCollegeProfile(college);
        return "redirect:/collegeprofile";
    }
}