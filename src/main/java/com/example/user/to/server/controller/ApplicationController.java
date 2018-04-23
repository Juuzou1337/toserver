package com.example.user.to.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/application")
public class ApplicationController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getApplication(ModelMap model){
        return "First application";
    }
}
