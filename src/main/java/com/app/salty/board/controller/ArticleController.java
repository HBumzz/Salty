package com.app.salty.board.controller;

import com.app.salty.board.dto.article.*;
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
    ArticleServiceImpl articleService;

    ArticleController(ArticleServiceImpl articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/boards")
    public ResponseEntity<List<GetArticleResponseDto>> getArticleAll() {
        List<GetArticleResponseDto> list = articleService.getArticleList();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/boards/{id}")
    public ResponseEntity<GetArticleResponseDto> getArticleBy(@PathVariable Long id) {
        GetArticleResponseDto article = articleService.getArticleById(id);
        return ResponseEntity.ok(article);
    }

    @PostMapping("/boards")
    public ResponseEntity<SaveArticleResponseDto> saveArticle(@RequestBody SaveArticleRequestDto requestDto
            , @AuthenticationPrincipal Users user){

        // 임의의 유저 생성 - test
        Users tempUser = new Users();
        tempUser.setId(1L);
        // ==============================

        requestDto.setUser(tempUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(articleService.saveArticle(requestDto));
    }

    @PutMapping("/boards/{id}")
    public ResponseEntity<UpdateArticleResponseDto> updateArticle(@PathVariable Long id
            , @RequestBody UpdateArticleRequestDto requestDto
            , @AuthenticationPrincipal Users user) {

        // 임의의 유저 생성 - test
        Users tempUser = new Users();
        tempUser.setId(1L);
        // ==============================

        requestDto.setUser(tempUser);
        requestDto.setId(id);

        return ResponseEntity.ok(articleService.updateArticle(requestDto));
    }

    @DeleteMapping("/boards/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable Long id
            ,  @AuthenticationPrincipal Users user) {
        articleService.deleteArticle(id);
        return ResponseEntity.ok().build();
    }

}
