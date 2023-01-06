package com.example.spring1st_re.controller;

import com.example.spring1st_re.dto.PostResponse;
import com.example.spring1st_re.dto.CreatePostRequest;
import com.example.spring1st_re.dto.DeletePostRequest;
import com.example.spring1st_re.dto.UpdatePostRequest;
import com.example.spring1st_re.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final BoardService boardService;

    // 게시물 생성
    @PostMapping("/api/posts")
    //CreateBoardRequest 의 값을 전달 받음.
    public void createBoard(@RequestBody CreatePostRequest createPostRequest) {
        boardService.createBoard(createPostRequest);
    }

    // 전체 게시물 조회
    @GetMapping("/api/posts")
    public List<PostResponse> getBoardList() {
        return boardService.getBoardList();
    }

    // 게시물 1개 조회
    ///api/posts/1
    @GetMapping("/api/posts/{boardId}")
    public PostResponse getBoard(@PathVariable Long boardId) {
      return boardService.getBoard(boardId);
    }

    // 게시물 1개 수정
    @PutMapping("/api/posts/{boardId}")
    public void updateBoard(@PathVariable Long boardId, @RequestBody UpdatePostRequest updatePostRequest) {
        boardService.updateBoard(boardId, updatePostRequest);
    }

    // 게시물 삭제
    @DeleteMapping("/api/posts/{boardId}")
    public void deleteBoard(@PathVariable Long boardId, @RequestBody DeletePostRequest deletePostRequest) {
        boardService.deleteBoard(boardId, deletePostRequest);
    }
}