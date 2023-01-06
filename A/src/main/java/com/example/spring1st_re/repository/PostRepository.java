package com.example.spring1st_re.repository;

import com.example.spring1st_re.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByOrderByCreatedAtDesc();

}
