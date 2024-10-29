package com.app.salty.board.service;

import com.app.salty.board.dto.comment.GetCommentResponseDto;
import com.app.salty.board.dto.comment.SaveCommentRequestDto;
import com.app.salty.board.dto.comment.UpdateCommentRequestDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CommentService {
    ResponseEntity<List<GetCommentResponseDto>> getCommentList();
    ResponseEntity<GetCommentResponseDto> getCommentById(Long id);
    ResponseEntity<Void> saveComment(SaveCommentRequestDto dto);
    ResponseEntity<Void> updateComment(UpdateCommentRequestDto dto);
    ResponseEntity<Void> deleteComment(Long id);

    ResponseEntity<List<GetCommentResponseDto>> getCommentByBoardId(Long boardId);

    ResponseEntity<List<GetCommentResponseDto>> getCommentByUserId(Long UserId);
}
