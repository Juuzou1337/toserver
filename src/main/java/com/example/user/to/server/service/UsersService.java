package com.example.user.to.server.service;

import com.example.user.to.server.entity.Users;

import java.util.List;

public interface UsersService {

    List<Users> getAll();
    Users getById(long id);
    Users save(Users users);
}
