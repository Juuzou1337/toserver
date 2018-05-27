package com.example.user.to.server.service;

import com.example.user.to.server.entity.Users;
import com.example.user.to.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public Users getUserByEmail(String email, String password) {
        return userRepository.getUserByEmail(email,password);
    }

    public Users saveUser(Users user) {
        return userRepository.saveAndFlush(user);
    }

    public List<Users> getAll() {
        return userRepository.findAll();
    }
}
