package com.app.salty.board.service;

import com.app.salty.board.dto.article.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ArticleService {
    List<GetArticleResponseDto> getArticleList();
    GetArticleResponseDto getArticleById(Long id);
    SaveArticleResponseDto saveArticle(SaveArticleRequestDto dto);
    UpdateArticleResponseDto updateArticle(UpdateArticleRequestDto dto) throws IllegalAccessException;
    void deleteArticle(Long id);

    ResponseEntity<List<GetArticleResponseDto>> getArticleListById(Long Id);

    ResponseEntity<GetArticleWithCommentResponseDto> getArticleWithCommentById(Long Id);
}
