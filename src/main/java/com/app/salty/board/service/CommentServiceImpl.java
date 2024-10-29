package com.app.salty.board.service;

import com.app.salty.board.dto.comment.GetCommentResponseDto;
import com.app.salty.board.dto.comment.SaveCommentRequestDto;
import com.app.salty.board.dto.comment.UpdateCommentRequestDto;
import com.app.salty.board.repository.CommentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    CommentRepository commentRepository;

    CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public ResponseEntity<List<GetCommentResponseDto>> getCommentList() {
        return null;
    }

    @Override
    public ResponseEntity<GetCommentResponseDto> getCommentById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> saveComment(SaveCommentRequestDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateComment(UpdateCommentRequestDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteComment(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<GetCommentResponseDto>> getCommentByBoardId(Long boardId) {
        return null;
    }

    @Override
    public ResponseEntity<List<GetCommentResponseDto>> getCommentByUserId(Long UserId) {
        return null;
    }
}
