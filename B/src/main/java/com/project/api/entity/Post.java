package com.project.api.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;


@Getter
@Entity
public class Post extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name ="post_id")
    private List<Comment> comments;

    private String title;

    @ManyToOne
    @JoinColumn(name = "username")
    private User writer;

    private String password;
    private String content;

    public Post() {}

    public Post(String title, User writer, String password, String content) {

        this.title = title;
        this.writer = writer;
        this.content = content;
    }

    public void update(String title, String content) {

        this.title = title;
        this.content = content;
    }
}
