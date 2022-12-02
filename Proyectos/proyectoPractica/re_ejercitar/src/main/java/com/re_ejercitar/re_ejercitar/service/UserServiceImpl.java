package com.re_ejercitar.re_ejercitar.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.re_ejercitar.re_ejercitar.model.User;
import com.re_ejercitar.re_ejercitar.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(Integer id){
        Optional <User> users = userRepository.findById(id);
        return users.orElse(null);
    }

    @Override
    public User save(User user){
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id){
        userRepository.deleteById(id);
    }
}
