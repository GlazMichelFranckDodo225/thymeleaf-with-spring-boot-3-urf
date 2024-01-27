package com.dgmf.controller;

import com.dgmf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

    // Handle Method for "fragment-expression" Request
    // http://localhost:8080/fragment-expression
    @GetMapping("/fragment-expression")
    public String fragmentExpression(Model model) {

        return "fragment-expression";
    }

    // Handle Method for Looping or Iteration Request
    // http://localhost:8080/users
    @GetMapping("/users")
    public String loopExpression(Model model) {
        User johnDoe = User.builder()
                .name("John Doe")
                .email("johndoe@gmail.com")
                .role("ADMIN")
                .gender("Male")
                .build();

        User manuellaLafagas = User.builder()
                .name("Manuella Lafagas")
                .email("manuellalafagas@gmail.com")
                .role("USER")
                .gender("Female")
                .build();

        User zoroBi = User.builder()
                .name("Zoro Bi")
                .email("zorobi@gmail.com")
                .role("USER")
                .gender("Male")
                .build();

        List<User> users = new ArrayList<>();
        users.add(johnDoe);
        users.add(manuellaLafagas);
        users.add(zoroBi);

        model.addAttribute("users", users);

        return "users";
    }

    // Handle Method for Condition Request
    // http://localhost:8080/condition-expression-if-unless
    @GetMapping("/condition-expression-if-unless")
    public String conditionExpression(Model model) {
        User johnDoe = User.builder()
                .name("John Doe")
                .email("johndoe@gmail.com")
                .role("ADMIN")
                .gender("Male")
                .build();

        User manuellaLafagas = User.builder()
                .name("Manuella Lafagas")
                .email("manuellalafagas@gmail.com")
                .role("USER")
                .gender("Female")
                .build();

        User zoroBi = User.builder()
                .name("Zoro Bi")
                .email("zorobi@gmail.com")
                .role("USER")
                .gender("Male")
                .build();

        List<User> users = new ArrayList<>();
        users.add(johnDoe);
        users.add(manuellaLafagas);
        users.add(zoroBi);

        model.addAttribute("users", users);

        return "condition-expression-if-unless";
    }
}
