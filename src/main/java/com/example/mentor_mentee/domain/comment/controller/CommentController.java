package com.example.mentor_mentee.domain.comment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @PostMapping("/")
    public String createComment(String writer, String content) {
        return writer + ": " + content + "댓글 생성 완료";
    }

    @GetMapping("/{comment-id}")
    public String getCommentById(@PathVariable(value = "comment-id") Long id) {
        return id + "번 댓글 조회 완료";
    }

    @PutMapping("/{comment-id}")
    public String updateComment(@PathVariable(value = "comment-id") Long id) {
        return id + "번 댓글 수정 완료";
    }

    @DeleteMapping("/{comment-id}")
    public String deleteById(@PathVariable(value = "comment-id") Long id) {
        return id + "번 댓글 삭제 완료";
    }
}
