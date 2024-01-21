package com.dgmf.controller;

import com.dgmf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    // Handle Method for "variable-expression" Request
    // http://localhost:8080/variable-expression
    @GetMapping("/variable-expression")
    public String variableExpression(Model model) {
        User user = User.builder()
                .name("John Doe")
                .email("johndoe@gmail.com")
                .role("ADMIN")
                .gender("Male")
                .build();

        model.addAttribute("user", user);

        return "variable-expression";
    }

    // Handle Method for "selection-expression" Request
    // http://localhost:8080/selection-expression
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model) {
        User user = User.builder()
                .name("John Doe")
                .email("johndoe@gmail.com")
                .role("ADMIN")
                .gender("Male")
                .build();

        model.addAttribute("user", user);

        return "selection-expression";
    }

    // Handle Method for "message-expression" Request
    // http://localhost:8080/message-expression
    @GetMapping("/message-expression")
    public String messageExpression() {

        return "message-expression";
    }

    // Handle Method for "link-expression" Request
    // http://localhost:8080/link-expression
    @GetMapping("/link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);

        return "link-expression";
    }
}