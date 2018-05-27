package com.example.user.to.server.controller;


import com.example.user.to.server.entity.Users;
import com.example.user.to.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/get_users", method = RequestMethod.GET)
    @ResponseBody
    public List<Users> getUsersAll(){
        return service.getAll();
    }

    @RequestMapping(value = "/get_user/{email}/{password}/", method = RequestMethod.GET)
    @ResponseBody
    public Users getUser(@PathVariable("email") String email, @PathVariable("password") String password){
        return service.getUserByEmail(email,password);
    }

    @RequestMapping(value = "/user_add", method = RequestMethod.POST)
    @ResponseBody
    public Users saveUser(@RequestBody Users user){
        return service.saveUser(user);
    }
}
