package org.example.web.controllers;

import org.apache.log4j.Logger;
import org.example.app.services.LoginService;
import org.example.app.services.RegisterService;
import org.example.web.dto.LoginForm;
import org.example.web.dto.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/registration")
public class RegisterController {

    private final Logger logger = Logger.getLogger(LoginController.class);
    private final RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @GetMapping
    public String login(Model model) {
        logger.info("GET /login returns login_page.html");
        model.addAttribute("loginForm", new RegisterForm());
        return "register_form";
    }

    @PostMapping("/register")
    public String authenticate(RegisterForm registerForm) {

            logger.info("registration OK redirect to book shelf");
            return "redirect:/books/shelf";

    }
}
