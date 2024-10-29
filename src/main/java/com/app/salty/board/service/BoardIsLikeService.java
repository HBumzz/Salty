package com.app.salty.board.service;

import com.app.salty.board.dto.board.GetBoardResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BoardIsLikeService {
    ResponseEntity<Void> okMyBoardLike(Long boardID);
    ResponseEntity<Void> cancelMyBoardLike(Long boardID);

    ResponseEntity<List<GetBoardResponseDto>> myLikeBoardList(Long userId);

    boolean isMyBoardLike(Long userId, Long boardId);
}
