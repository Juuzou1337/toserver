package com.example.user.to.server.controller;

import com.example.user.to.server.entity.News;
import com.example.user.to.server.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    NewsService service;

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    @ResponseBody
    public List<News> getNews(){
        return service.getAll();
    }

    @RequestMapping(value = "/news/{id}", method = RequestMethod.GET)
    @ResponseBody
    public News getNewsById(@PathVariable("id") long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/news_add", method = RequestMethod.POST)
    @ResponseBody
    public News saveNews(@RequestBody News news){
        return service.save(news);
    }

    @RequestMapping(value = "/news_delete/{id}")
    @ResponseBody
    public void deleteNews(@PathVariable("id") long id){
         service.delete(id);
    }

}
