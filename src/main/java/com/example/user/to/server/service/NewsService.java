package com.example.user.to.server.service;

import com.example.user.to.server.entity.News;

import java.util.List;

public interface NewsService {

    List <News> getAll();
    News getById(long id);
    News save(News news);
    void delete(long id);
}
