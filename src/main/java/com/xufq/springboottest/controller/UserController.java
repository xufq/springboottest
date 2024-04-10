package com.xufq.springboottest.controller;

import com.xufq.springboottest.entity.User;
import com.xufq.springboottest.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{name}")
    public User hello(@PathVariable String name){
        return userService.getUserByName(name);
    }


    @PostMapping
    public Integer createUser(@RequestBody User user){
        return userService.createUser(user);
    }

}
