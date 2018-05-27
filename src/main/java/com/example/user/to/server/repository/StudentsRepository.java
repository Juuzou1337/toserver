package com.example.user.to.server.repository;

import com.example.user.to.server.entity.Students;
import com.example.user.to.server.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentsRepository extends JpaRepository<Students,Long> {
    @Query("select u from Students u where u.last_name = :last_name AND u.first_name = :first_name AND u.second_name = :second_name")
    Students getStudentsByFIO(@Param("last_name") String last_name, @Param("first_name") String first_name, @Param("second_name") String second_name);
}
