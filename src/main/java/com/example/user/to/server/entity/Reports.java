package com.example.user.to.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reports")
public class Reports {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "id_personal", nullable = false, length = 10)
    private int id_personal;

    @Column(name = "id_application", nullable = false, length = 10)
    private int id_application;

    @Column(name = "description", nullable = false, length = 50)
    private String description;

    @Column(name = "materials", nullable = false, length = 150)
    private String materials;

    @Column(name = "date", nullable = false, length = 150)
    private Date date;

    @Column(name = "room", nullable = false, length = 150)
    private int room;

    public Reports() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_user) {
        this.id_personal = id_user;
    }

    public int getId_application() {
        return id_application;
    }

    public void setId_application(int id_application) {
        this.id_application = id_application;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
