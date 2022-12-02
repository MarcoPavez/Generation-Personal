package com.re_ejercitar.re_ejercitar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.re_ejercitar.re_ejercitar.model.User;

public interface UserRepository extends CrudRepository <User,Integer>{
    
    @Query(value="SELECT * FROM user u",nativeQuery=true)
    List<User> findUser();

    @Query(value="SELECT * FROM user u WHERE id = ?1",nativeQuery=true)
    List<User> findUser(User id);
}
