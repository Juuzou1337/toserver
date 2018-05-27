package com.example.user.to.server.controller;

import com.example.user.to.server.entity.Users;
import com.example.user.to.server.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersService service;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<Users> getApplications(){
        return service.getAll();
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Users getApplication(@PathVariable("id") long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/users_add", method = RequestMethod.POST)
    @ResponseBody
    public Users saveApplication(@RequestBody Users users){
        return service.save(users);
    }
}
