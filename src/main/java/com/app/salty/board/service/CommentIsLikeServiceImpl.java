package com.app.salty.board.service;

import com.app.salty.board.repository.CommentLikeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CommentIsLikeServiceImpl implements CommentIsLikeService {

    CommentLikeRepository commentLikeRepository;

    CommentIsLikeServiceImpl(CommentLikeRepository commentLikeRepository) {
        this.commentLikeRepository = commentLikeRepository;
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
