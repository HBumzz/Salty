package com.app.salty.board.service;

import org.springframework.http.ResponseEntity;

public interface CommentIsLikeService {
    ResponseEntity<Void> okMyCommentLike(Long boardID);
    ResponseEntity<Void> cancelMyCommentLike(Long boardID);

    boolean isMyCommentLike(Long userId, Long commentId);
}
