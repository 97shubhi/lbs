package com.dz.lbsuser.controller;

import com.dz.lbsuser.Entity.User;
import com.dz.lbsuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/saveUser")
    public User saveUser(User user){
        return userService.saveUser (user);
    }

    @RequestMapping("getUser")
    public Optional<User> getUser(long id){

        return userService.getUserById (id);
    }

}
