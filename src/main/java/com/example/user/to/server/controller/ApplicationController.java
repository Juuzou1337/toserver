package com.example.user.to.server.controller;

import com.example.user.to.server.entity.Application;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Application getApplication(){
        return createMockApp();
    }

    private Application createMockApp() {
        Application application = new Application();
        application.setId(1);
        application.setTitle("Свет");
        application.setDescription("Не работают лампочки");
        application.setApplicationDate(new Date());
        application.setStatus(1);
        application.setIdUser(1);
        return application;
    }
}
