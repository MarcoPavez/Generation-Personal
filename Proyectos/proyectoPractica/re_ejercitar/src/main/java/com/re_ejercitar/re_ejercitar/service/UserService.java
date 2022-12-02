package com.re_ejercitar.re_ejercitar.service;

import com.re_ejercitar.re_ejercitar.model.User;

public interface UserService {
    
    User getUser(Integer id);

    User save(User user);

    void delete(Integer id);
}
