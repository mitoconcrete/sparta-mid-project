package com.example.spring1st_re.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Post extends TimeStamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String title;
    private String writer;
    private String password;
    private String content;

    // public Board() {} // 기본 생성자는 반드시 있어야 한다.

    public Post(String title, String writer, String password, String content) {
        this.title = title;
        this.writer = writer;
        this.password = password;
        this.content = content;
    } // 게시판 생성 - 제목, 글쓴이, 비밀번호, 내용 => 이렇게 네 개의 요소

    public void update(String title, String writer, String content) {
        this.title = title;
        this.writer = writer;
        this.content = content;
    } // 게시글 업데이트(수정) 로직 / 제목, 작성자명, 작성 내용을 수정

    //비밀번호 검증 로직
    public boolean isValidPassword(String inputPassword) {
        if (inputPassword.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }
}