package com.example.user.to.server.entity;

import org.hibernate.annotations.GenericGenerator;
import sun.security.util.Password;

import javax.persistence.*;
import java.net.PasswordAuthentication;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;


    @Column(name = "LastName", nullable = false, length = 20)
    private String last_name;

    @Column(name = "FirstName", nullable = false, length = 20)
    private String first_name;

    @Column(name = "SecondName", nullable = false, length = 20)
    private String second_name;

    @Column(name = "Email", nullable = false, length = 50)
    private String email;

    @Column(name = "Password", nullable = false, length = 20)
    private String password;

    @Column(name = "RePassword", nullable = false, length = 20)
    private String re_password;

    @Column(name = "Status", nullable = false, length = 1)
    private int status;

    public Users() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRe_password() {
        return re_password;
    }

    public void setRe_password(String re_password) {
        this.re_password = re_password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
