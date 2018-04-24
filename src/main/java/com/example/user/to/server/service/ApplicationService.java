package com.example.user.to.server.service;

import com.example.user.to.server.entity.Application;

import java.util.List;

public interface ApplicationService {

    List<Application> getAll();
    Application getById(long id);
    Application save(Application application);
}
