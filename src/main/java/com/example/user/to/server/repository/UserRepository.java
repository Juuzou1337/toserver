package com.example.user.to.server.repository;

import com.example.user.to.server.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<Users,Long> {

    @Query("select u from Users u where u.email = :email AND u.password = :password")
    Users getUserByEmail(@Param("email") String email, @Param("password") String password);
}
