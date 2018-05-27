package com.example.user.to.server.service;

import com.example.user.to.server.entity.Users;

import java.util.List;

public interface UserService {

    Users getUserByEmail(String email, String password);
    Users saveUser(Users user);
    List<Users> getAll();
}
