package com.project.api.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Comment extends TimeStamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Post post;

    private String content;

    @ManyToOne
    @JoinColumn
    private User writer;

    public Comment(Post post, User user, String content ) {
        this.post = post;
        this.content = content;
        this.writer = user;
    }

    public void update(Post post, User user, String content) {
        this.post = post;
        this.writer = user;
        this.content = content;
    }
}
