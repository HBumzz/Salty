package com.app.salty.board.controller;

import com.app.salty.board.dto.board.GetBoardResponseDto;
import com.app.salty.board.dto.board.SaveBoardRequestDto;
import com.app.salty.board.dto.board.SaveBoardResponseDto;
import com.app.salty.board.entity.Board;
import com.app.salty.board.service.BoardServiceImpl;
import com.app.salty.user.entity.Users;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BoardController {
    BoardServiceImpl boardService;

    BoardController(BoardServiceImpl boardService) {
        this.boardService= boardService;
    }

    @GetMapping("/boards")
    public ResponseEntity<List<GetBoardResponseDto>> getBoardAll() {
        List<GetBoardResponseDto> list = boardService.getBoardList();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/boards")
    public ResponseEntity<SaveBoardResponseDto> saveBoard(@RequestBody SaveBoardRequestDto requestDto, @AuthenticationPrincipal Users user){

        // 임의의 유저 생성 - test
        Users tempUser = new Users();
        tempUser.setId(1L);
        // ==============================

        requestDto.setUser(tempUser);
        Board board = boardService.saveBoard(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new SaveBoardResponseDto(board));
    }

}
