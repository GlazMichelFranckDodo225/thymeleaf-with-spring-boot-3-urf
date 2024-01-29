package com.dgmf.controller;

import com.dgmf.entity.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    // Handler Method for User Registration Page Request
    @GetMapping("/register")
    public String userRegistrationPage(Model model) {
        // Empty User Form Model to Store User Data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        // List of User Professions
        List<String> professions = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("professions", professions);

        return "register-form";
    }
}
