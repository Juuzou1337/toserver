package com.example.user.to.server.controller;

import com.example.user.to.server.entity.Students;
import com.example.user.to.server.entity.Users;
import com.example.user.to.server.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    private StudentsService service;

    @RequestMapping(value = "/get_students", method = RequestMethod.GET)
    @ResponseBody
    public List<Students> getStudentsAll(){
        return service.getAll();
    }

    @RequestMapping(value = "/get_students/{last_name}/{first_name}/{second_name}", method = RequestMethod.GET)
    @ResponseBody
    public Students getStudentsByFIO(@PathVariable("last_name") String last_name, @PathVariable("first_name") String first_name, @PathVariable("second_name") String second_name){
        return service.getStudentsByFIO(last_name,first_name,second_name);
    }

    @RequestMapping(value = "/students_add", method = RequestMethod.POST)
    @ResponseBody
    public Students saveUser(@RequestBody Students students){
        return service.addStudents(students);
    }

    @RequestMapping(value = "/students_delete/{id}")
    @ResponseBody
    public void deleteNews(@PathVariable("id") long id){
        service.delete(id);
    }

}
