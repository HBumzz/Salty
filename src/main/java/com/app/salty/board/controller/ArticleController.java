package com.app.salty.board.controller;

import com.app.salty.board.dto.article.GetArticleResponseDto;
import com.app.salty.board.dto.article.SaveArticleRequestDto;
import com.app.salty.board.dto.article.SaveArticleResponseDto;
import com.app.salty.board.entity.Article;
import com.app.salty.board.service.ArticleServiceImpl;
import com.app.salty.user.entity.Users;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticleController {
    ArticleServiceImpl boardService;

    ArticleController(ArticleServiceImpl boardService) {
        this.boardService= boardService;
    }

    @GetMapping("/boards")
    public ResponseEntity<List<GetArticleResponseDto>> getBoardAll() {
        List<GetArticleResponseDto> list = boardService.getBoardList();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/boards")
    public ResponseEntity<SaveArticleResponseDto> saveBoard(@RequestBody SaveArticleRequestDto requestDto, @AuthenticationPrincipal Users user){

        // 임의의 유저 생성 - test
        Users tempUser = new Users();
        tempUser.setId(1L);
        // ==============================

        requestDto.setUser(tempUser);
        Article article = boardService.saveBoard(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new SaveArticleResponseDto(article));
    }

}
