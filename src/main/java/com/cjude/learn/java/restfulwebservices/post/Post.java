package com.cjude.learn.java.restfulwebservices.post;

import com.cjude.learn.java.restfulwebservices.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity(name = "posts")
public class Post {
    @Id
    @GeneratedValue
    private Integer Id;

    @Size(min = 10)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    public Post() {
    }

    public Integer getId() {
        return Id;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "Id=" + Id +
                ", description='" + description + '\'' +
                '}';
    }
}
