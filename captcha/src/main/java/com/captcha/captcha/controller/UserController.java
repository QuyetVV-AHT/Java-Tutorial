package com.captcha.captcha.controller;

import java.util.List;

import com.captcha.captcha.model.User;
import com.captcha.captcha.service.IUserService;
import com.captcha.captcha.util.CaptchaUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import cn.apiclub.captcha.Captcha;
@Controller
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUserService service;

    @GetMapping("/register")
    public String registerUser(Model model) {
        User user = new User();
        getCaptcha(user);
        model.addAttribute("user", user);
        return "registerUser";
    }

    @PostMapping("/save")
    public String saveUser(
            @ModelAttribute User user,
            Model model
    ) {
        if(user.getCaptcha().equals(user.getHiddenCaptcha())) {
            service.createUser(user);
            model.addAttribute("message", "User Registered successfully!");
            return "redirect:allUsers";
        }
        else {
            model.addAttribute("message", "Invalid Captcha");
            getCaptcha(user);
            model.addAttribute("user", user);
        }
        return "registerUser";
    }

    @GetMapping("/allUsers")
    public String getAllUsers(Model model) {
        List<User> userList= service.getAllUsers();
        model.addAttribute("userList", userList);
        return "listUsers";
    }

    private void getCaptcha(User user) {
        Captcha captcha = CaptchaUtil.createCaptcha(240, 70);
        user.setHiddenCaptcha(captcha.getAnswer());
        user.setCaptcha(""); // value entered by the User
        user.setRealCaptcha(CaptchaUtil.encodeCaptcha(captcha));

    }


}
