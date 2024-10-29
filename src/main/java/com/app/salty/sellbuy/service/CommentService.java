package com.app.salty.sellbuy.service;

import com.app.salty.sellbuy.dto.request.CommentRequest;
import com.app.salty.sellbuy.dto.response.CommentResponse;
import com.app.salty.sellbuy.entity.Comment;
import com.app.salty.sellbuy.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentResponse save(CommentRequest request) {
        Comment comment = request.toEntity(); // DTO에서 엔티티로 변환
        Comment savedComment = commentRepository.save(comment); // 댓글 저장
        return new CommentResponse(savedComment.getId(), savedComment.getContent(), savedComment.getArticleId());
    }

    public List<CommentResponse> findByArticleId(Long articleId) {
        List<Comment> comments = commentRepository.findByArticleId(articleId); // 게시글 ID로 댓글 조회
        return comments.stream()
                .map(comment -> new CommentResponse(comment.getId(), comment.getContent(), comment.getArticleId()))
                .collect(Collectors.toList());
    }
}
