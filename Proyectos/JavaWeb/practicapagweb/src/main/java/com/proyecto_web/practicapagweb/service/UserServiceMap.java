package com.proyecto_web.practicapagweb.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.proyecto_web.practicapagweb.model.User;

@Primary
@Service
public class UserServiceMap implements UserService{
    
    private Map <Integer, User> userMap = new HashMap<>();

    @Override
    public List <User> getAll(){
        List <User> nuevaLista = new ArrayList <>();
        userMap.forEach((k,v)-> nuevaLista.add(k,v));
        return nuevaLista;
    }

    public void add(User user){
        userMap.put(user.getId(),user);
    };

    public void remove (User user){
        userMap.remove(user.getId(), user);
    };

    public int size(){
        return userMap.size();
    };

    public User getUser(int position){
        return userMap.get(position);
    };
}
