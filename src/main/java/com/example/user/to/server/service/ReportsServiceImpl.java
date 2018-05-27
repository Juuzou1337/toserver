package com.example.user.to.server.service;

import com.example.user.to.server.entity.Reports;
import com.example.user.to.server.repository.ReportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportsServiceImpl implements ReportsService {

    @Autowired
    ReportsRepository repository;

    public List<Reports> getReportsByIdPersonal(int id_personal) {
        return (List<Reports>) repository.getReportsByIdPersonal(id_personal);
    }

    public Reports getById(long id_report) {
        return repository.findOne(id_report);
    }

    public Reports save(Reports report) {
        return repository.saveAndFlush(report);
    }

    public List<Reports> getAll() {
        return repository.findAll();
    }
}
