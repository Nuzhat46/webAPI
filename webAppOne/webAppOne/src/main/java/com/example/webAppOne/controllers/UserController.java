package com.example.webAppOne.controllers;

import com.example.webAppOne.models.User;
import com.example.webAppOne.services.UserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //userService instance
    private UserSer userService;

    @Autowired
    public UserController(UserSer userService) {
        this.userService = userService;
    }


    //return a user
    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        return userService.getuser(id);

    }
}
