package org.example.app.services;

import org.apache.log4j.Logger;
import org.example.web.dto.RegisterForm;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    private Logger logger = Logger.getLogger(RegisterService.class);

    public boolean registrate(RegisterForm registerForm) {
        logger.info("registered new user: " + registerForm);
        return registerForm.getUsername().equals("root") && registerForm.getPassword().equals("123");
    }
}
