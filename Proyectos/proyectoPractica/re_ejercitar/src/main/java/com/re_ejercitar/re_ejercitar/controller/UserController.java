package com.re_ejercitar.re_ejercitar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.re_ejercitar.re_ejercitar.model.User;
import com.re_ejercitar.re_ejercitar.service.UserService;

@CrossOrigin("*")
@RestController
public class UserController {
    
    private UserService userService;

    public UserController (@Autowired UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
    
    @PostMapping("/user")
    public User newUser(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.delete(id);
    }
}
