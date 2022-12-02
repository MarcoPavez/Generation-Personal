package com.prueba_springboot.demo_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba_springboot.demo_springboot.model.User;
import com.prueba_springboot.demo_springboot.service.UserService;

//Controller desde web solicita informacion a java, capa mas externa, hace llamados a la URL
//al ser aplicacion web, la forma de interactuar con el usuario, este vaya pag por pag y accion por accion, para ello se ocupan las URL
//puede ser desde URL (PathVariable) o del tipo JSON (RequestBody)
@RestController
@CrossOrigin("*") //da permisos y permite hacer peticione desde cualquier parte, no solo desde server local
public class UserController {
    
    private UserService userService; 

    //Autowired es como el link externo, entre web y java(programa)
    //conexion de permisos correspondientes, se llama igual a la clase
    public UserController (@Autowired UserService userService){
        this.userService = userService;
    }

    //getUser y todo en amarillo es un controlador
    @GetMapping("/user/{id}")
    public User getUser (@PathVariable Integer id){
        return userService.getUser(id);
    }

    //si no lleva id, agrega; si lleva id, pero no existe, agrega tambien 
    @PostMapping("/user")
    public User newUser(@RequestBody User user){
        return userService.save(user);
    }

    //si lleva id y si el id existe en la base, lo actualiza con nuevos datos
    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.delete(id);
    }

    //PathVariable cuando se ingresa dato desde url (get y delete)
    //Request body se ocupa cuando se manda desde postman, con formato json
}
