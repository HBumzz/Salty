package com.app.salty.board.service;

import com.app.salty.board.dto.board.GetBoardResponseDto;
import com.app.salty.board.dto.board.GetBoardWithCommentResponseDto;
import com.app.salty.board.dto.board.SaveBoardRequestDto;
import com.app.salty.board.dto.board.UpdateBoardRequestDto;
import com.app.salty.board.repository.BoardRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    BoardRepository boardRepository;

    BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }


    @Override
    public ResponseEntity<List<GetBoardResponseDto>> getBoardList() {
        return null;
    }

    @Override
    public ResponseEntity<GetBoardResponseDto> getBoardById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> saveBoard(SaveBoardRequestDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateBoard(UpdateBoardRequestDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteBoard(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<GetBoardResponseDto>> getBoardListById(Long Id) {
        return null;
    }

    @Override
    public ResponseEntity<GetBoardWithCommentResponseDto> getBoardWithCommentById(Long Id) {
        return null;
    }
}
