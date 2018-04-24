package com.example.user.to.server.service;

import com.example.user.to.server.entity.Application;
import com.example.user.to.server.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService{

    @Autowired
    private ApplicationRepository repository;

    public List<Application> getAll() {
        return repository.findAll();
    }

    public Application getById(long id) {
        return repository.findOne(id);
    }

    public Application save(Application application) {
        return repository.saveAndFlush(application);
    }
}
