package com.app.salty.board.service;

import com.app.salty.board.dto.article.*;

import java.util.List;

public interface ArticleService {
    List<GetArticleResponseDto> getArticleList();
    GetArticleResponseDto getArticleById(Long id);
    SaveArticleResponseDto saveArticle(SaveArticleRequestDto dto);
    UpdateArticleResponseDto updateArticle(UpdateArticleRequestDto dto, Long articleId) throws IllegalAccessException;
    void deleteArticle(Long id);

    List<GetArticleResponseDto> getArticlesByUserId(Long Id);

    GetArticleWithCommentResponseDto getArticleWithCommentByArticleId(Long Id);
}
