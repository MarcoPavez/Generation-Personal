package com.proyecto_web.practicapagweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto_web.practicapagweb.model.User;
import com.proyecto_web.practicapagweb.service.UserService;

@RestController
public class UserController {
    
    public UserService userService;
    
    public UserController(@Autowired UserService userService){
        this.userService = userService;
        userService.add(new User(1,"Juan","Barrias"));
        userService.add(new User(2,"Sandra","Zamora"));
    }

    @GetMapping("/user")
    public User getUser(){
        return userService.getUser(0);
    }

    @GetMapping("/AllUser")
    public List<User> getAllUser(){
        return userService.getAll();
    }

    @GetMapping("/AddUser/{id}/{nombre}/{apellido}")
    public void addUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido){
        userService.add(new User(id,nombre,apellido));
    }

    @GetMapping("/removeUser/{id}/{nombre}/{apellido}")
    public void removeUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido){
        userService.remove(new User(id, nombre, apellido));
    }

    @GetMapping("/countUser")
    public int getsize(){

        return userService.size();
    }
}
