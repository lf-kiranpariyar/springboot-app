package com.kiranpariyar.springbootapp.controller;

import com.kiranpariyar.springbootapp.entity.User;
import com.kiranpariyar.springbootapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/demo")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userService.save(user);
        return "Successfully Added New User";
    }

    @GetMapping(path = "/all")
    public @ResponseBody List<User> getAllUsers() {
        return userService.findAll();
    }
}
