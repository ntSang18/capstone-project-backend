package com.capstone.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.backend.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
