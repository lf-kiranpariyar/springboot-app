package com.kiranpariyar.springbootapp.service;

import com.kiranpariyar.springbootapp.entity.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> findAll();

}
