package com.cjude.learn.java.restfulwebservices.jpa;

import com.cjude.learn.java.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
