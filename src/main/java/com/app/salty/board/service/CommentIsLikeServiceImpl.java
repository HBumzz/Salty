package com.app.salty.board.service;

import com.app.salty.board.repository.CommentIsLikeRepository;
import org.springframework.http.ResponseEntity;

public class CommentIsLikeServiceImpl implements CommentIsLikeService {

    CommentIsLikeRepository commentIsLikeRepository;

    CommentIsLikeServiceImpl(CommentIsLikeRepository commentIsLikeRepository) {
        this.commentIsLikeRepository = commentIsLikeRepository;
    }

    @Override
    public ResponseEntity<Void> okMyCommentLike(Long boardID) {
        return null;
    }

    @Override
    public ResponseEntity<Void> cancelMyCommentLike(Long boardID) {
        return null;
    }

    @Override
    public boolean isMyCommentLike(Long userId, Long commentId) {
        return false;
    }
}
