package com.proyecto_web.practicapagweb.service;

import java.util.List;

import com.proyecto_web.practicapagweb.model.User;

public interface UserService {
   List<User> getAll(); //trae todos los usuarios

   void add(User user);  //agrega users

   void remove (User user); //remover user

   int size(); // cuantos users tenemos

   User getUser (int position); // saber posicion del user
}
