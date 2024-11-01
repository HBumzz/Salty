package com.app.salty.board.service;

import com.app.salty.board.dto.board.GetBoardResponseDto;
import com.app.salty.board.dto.board.GetBoardWithCommentResponseDto;
import com.app.salty.board.dto.board.SaveBoardRequestDto;
import com.app.salty.board.dto.board.UpdateBoardRequestDto;
import com.app.salty.board.entity.Board;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BoardService {
    List<GetBoardResponseDto> getBoardList();
    ResponseEntity<GetBoardResponseDto> getBoardById(Long id);
    Board saveBoard(SaveBoardRequestDto dto);
    ResponseEntity<Void> updateBoard(UpdateBoardRequestDto dto);
    ResponseEntity<Void> deleteBoard(Long id);

    ResponseEntity<List<GetBoardResponseDto>> getBoardListById(Long Id);

    ResponseEntity<GetBoardWithCommentResponseDto> getBoardWithCommentById(Long Id);
}
