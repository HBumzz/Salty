package com.app.salty.sellbuy.controller;

import com.app.salty.sellbuy.dto.request.CommentRequest;
import com.app.salty.sellbuy.dto.response.CommentResponse;
import com.app.salty.sellbuy.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/article/{articleId}")
    public ResponseEntity<CommentResponse> addComment(
            @PathVariable Long articleId,
            @RequestBody CommentRequest request) { // 인증 제거

        try {
            request.setArticleId(articleId); // articleId 설정
            CommentResponse savedComment = commentService.save(request); // 댓글 저장
            return ResponseEntity.status(HttpStatus.CREATED).body(savedComment);
        } catch (Exception e) {
            // 예외 발생 시 처리
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new CommentResponse(null, "Error: " + e.getMessage(), null));
        }
    }

    @GetMapping("/article/{articleId}")
    public ResponseEntity<List<CommentResponse>> getCommentsByArticleId(@PathVariable Long articleId) {
        List<CommentResponse> comments = commentService.findByArticleId(articleId); // 댓글 조회
        return ResponseEntity.ok(comments);
    }
}
