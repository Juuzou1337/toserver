package com.example.user.to.server.service;

import com.example.user.to.server.entity.Reports;

import java.util.List;

public interface ReportsService {

    List<Reports> getReportsByIdPersonal(int id_personal);
    Reports getById(long id_report);
    Reports save(Reports report);
    List<Reports> getAll();
}
