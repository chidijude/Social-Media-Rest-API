package com.cjude.learn.java.restfulwebservices.jpa;

import com.cjude.learn.java.restfulwebservices.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
