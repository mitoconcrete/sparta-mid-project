package com.example.spring1st_re.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor // 기본생성자 생성과 동일
public class CreatePostRequest {
    private String title;
    private String writer;
    private String password;
    private String content;

    //@Getter와 @NoArgsConstructor가 합쳐져서 @Setter 없어도 값이 title, writer, password, content에 꽂힌다.

    //public CreateBoardRequest() {} => NoArgsConstructor로 치환.

    public CreatePostRequest(String title, String writer, String password, String content) {
        this.title = title;
        this.writer = writer;
        this.password = password;
        this.content = content;
    }
}
