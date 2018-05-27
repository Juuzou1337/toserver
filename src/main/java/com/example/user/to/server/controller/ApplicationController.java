package com.example.user.to.server.controller;

import com.example.user.to.server.entity.Application;
import com.example.user.to.server.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    private ApplicationService service;

    @RequestMapping(value = "/applications", method = RequestMethod.GET)
    @ResponseBody
    public List <Application> getApplications(){
        return service.getAll();
    }

    @RequestMapping(value = "/applications/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Application getApplication(@PathVariable("id") long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/applications_add", method = RequestMethod.POST)
    @ResponseBody
    public Application saveApplication(@RequestBody Application application){
        return service.save(application);
    }
}
