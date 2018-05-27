package com.example.user.to.server.service;

import com.example.user.to.server.entity.Students;

import java.util.List;

public interface StudentsService {
    Students getStudentsByFIO(String last_name, String first_name, String second_name);
    Students addStudents(Students students);
    List<Students> getAll();
    void delete(long id);
}
