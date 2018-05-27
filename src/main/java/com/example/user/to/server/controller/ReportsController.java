package com.example.user.to.server.controller;

import com.example.user.to.server.entity.Reports;
import com.example.user.to.server.service.ReportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReportsController {

    @Autowired
    private ReportsService service;

    @RequestMapping(value = "/reports", method = RequestMethod.GET)
    @ResponseBody
    public List <Reports> getApplications(){
        return service.getAll();
    }

    @RequestMapping(value = "get_reports/{id_personal}",method = RequestMethod.GET)
    @ResponseBody
    public List<Reports> get_reports_by_id_personal(@PathVariable("id_personal") int id_personal){
        return service.getReportsByIdPersonal(id_personal);
    }

    @RequestMapping(value = "get_report/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Reports getReports(@PathVariable("id") long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/report_add", method = RequestMethod.POST)
    @ResponseBody
    public Reports saveApplication(@RequestBody Reports report){
        return service.save(report);
    }



}
