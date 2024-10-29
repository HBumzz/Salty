package com.app.salty.board.service;

import com.app.salty.board.dto.board.GetBoardResponseDto;
import com.app.salty.board.repository.BoardIsLikeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardIsLikeServiceImpl implements BoardIsLikeService {

    BoardIsLikeRepository boardIsLikeRepository;

    BoardIsLikeServiceImpl(BoardIsLikeRepository boardIsLikeRepository) {
        this.boardIsLikeRepository = boardIsLikeRepository;
    }

    @Override
    public ResponseEntity<Void> okMyBoardLike(Long boardID) {
        return null;
    }

    @Override
    public ResponseEntity<Void> cancelMyBoardLike(Long boardID) {
        return null;
    }

    @Override
    public ResponseEntity<List<GetBoardResponseDto>> myLikeBoardList(Long userId) {
        return null;
    }

    @Override
    public boolean isMyBoardLike(Long userId, Long boardId) {
        return false;
    }
}