package com.app.salty.sellbuy.repository;

import com.app.salty.sellbuy.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByArticleId(Long articleId); // 게시글 ID로 댓글 조회
}
