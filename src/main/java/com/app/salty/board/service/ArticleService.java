package com.app.salty.board.service;

import com.app.salty.board.dto.article.GetArticleResponseDto;
import com.app.salty.board.dto.article.GetArticleWithCommentResponseDto;
import com.app.salty.board.dto.article.SaveArticleRequestDto;
import com.app.salty.board.dto.article.UpdateArticleRequestDto;
import com.app.salty.board.entity.Article;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ArticleService {
    List<GetArticleResponseDto> getBoardList();
    ResponseEntity<GetArticleResponseDto> getBoardById(Long id);
    Article saveBoard(SaveArticleRequestDto dto);
    ResponseEntity<Void> updateBoard(UpdateArticleRequestDto dto);
    ResponseEntity<Void> deleteBoard(Long id);

    ResponseEntity<List<GetArticleResponseDto>> getBoardListById(Long Id);

    ResponseEntity<GetArticleWithCommentResponseDto> getBoardWithCommentById(Long Id);
}
