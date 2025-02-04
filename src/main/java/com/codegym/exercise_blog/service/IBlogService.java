package com.codegym.exercise_blog.service;

import com.codegym.exercise_blog.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();
    List<Blog>findByName(String searchName);
    void save(Blog product);
    Optional<Blog> findById(int id);
    void remove(Blog blog);
}