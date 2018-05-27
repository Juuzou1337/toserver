package com.example.user.to.server.service;

import com.example.user.to.server.entity.News;
import com.example.user.to.server.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsRepository repository;

    public List<News> getAll() {
        return repository.findAll();
    }

    public News getById(long id) {
        return repository.findOne(id);
    }

    public News save(News news) {
        return repository.saveAndFlush(news);
    }

    public void delete(long id) {
         repository.delete(id);
    }
}
