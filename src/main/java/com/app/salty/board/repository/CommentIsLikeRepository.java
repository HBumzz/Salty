package com.app.salty.board.repository;

import com.app.salty.board.entity.CommentLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentIsLikeRepository extends JpaRepository<Long, CommentLike> {
}
