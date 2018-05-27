package com.example.user.to.server.service;

import com.example.user.to.server.entity.Students;
import com.example.user.to.server.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    StudentsRepository repository;

    public Students getStudentsByFIO(String last_name, String first_name, String second_name) {
        return repository.getStudentsByFIO(last_name,first_name,second_name);
    }

    public Students addStudents(Students students) {
        return repository.saveAndFlush(students);
    }

    public List<Students> getAll() {
        return repository.findAll();
    }

    public void delete(long id) {
        repository.delete(id);
    }
}
