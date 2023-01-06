package com.example.spring1st_re.dto;

import com.example.spring1st_re.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostResponse {
    private String title;
    private String writer;
    private String content;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;


    public PostResponse(Post post) {
        this.title = post.getTitle();
        this.writer = post.getWriter();
        this.content = post.getContent();
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
    }
}
