package com.kiranpariyar.springbootapp.service;

import com.kiranpariyar.springbootapp.entity.User;
import com.kiranpariyar.springbootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        Iterable<User> userIterable = userRepository.findAll();
        List<User> users = new ArrayList<>();
        userIterable.forEach(users::add);
        return users;
    }
}
