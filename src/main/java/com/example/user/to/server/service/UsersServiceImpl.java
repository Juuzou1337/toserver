package com.example.user.to.server.service;

import com.example.user.to.server.entity.Users;
import com.example.user.to.server.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository repository;

    public List<Users> getAll() {
        return repository.findAll();
    }

    public Users getById(long id) {
        return repository.findOne(id);
    }

    public Users save(Users users) {
        return repository.saveAndFlush(users);
    }
}
