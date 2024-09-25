package com.dao.controller;

import com.dao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ModelAndView login(@RequestParam(name = "username" ) String username,@RequestParam(name = "password") String password) {
        boolean isValidUser = userService.authenticate(username, password);
        if (isValidUser) {
            return new ModelAndView("welcome");  // view name for successful login
        } else {
            return new ModelAndView("error");
        }
    }
}



