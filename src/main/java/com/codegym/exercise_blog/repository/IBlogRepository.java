package com.codegym.exercise_blog.repository;

import com.codegym.exercise_blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findBlogsByNameContaining(String searchName);

}