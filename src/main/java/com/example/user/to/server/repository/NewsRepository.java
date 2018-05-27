package com.example.user.to.server.repository;

import com.example.user.to.server.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
