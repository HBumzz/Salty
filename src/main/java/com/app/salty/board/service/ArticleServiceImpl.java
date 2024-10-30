package com.app.salty.board.service;

import com.app.salty.board.dto.article.GetArticleResponseDto;
import com.app.salty.board.dto.article.GetArticleWithCommentResponseDto;
import com.app.salty.board.dto.article.SaveArticleRequestDto;
import com.app.salty.board.dto.article.UpdateArticleRequestDto;
import com.app.salty.board.entity.Article;
import com.app.salty.board.repository.ArticleRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    ArticleRepository articleRepository;

    ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }


    @Override
    public List<GetArticleResponseDto> getBoardList() {
        List<Article> list = articleRepository.findAll();
        return list.stream().map(GetArticleResponseDto::new).toList();
    }

    @Override
    public ResponseEntity<GetArticleResponseDto> getBoardById(Long id) {
        return null;
    }

    @Override
    public Article saveBoard(SaveArticleRequestDto dto) {
        Article article = dto.toEntity();
        return articleRepository.save(article);
    }

    @Override
    public ResponseEntity<Void> updateBoard(UpdateArticleRequestDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteBoard(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<GetArticleResponseDto>> getBoardListById(Long Id) {
        return null;
    }

    @Override
    public ResponseEntity<GetArticleWithCommentResponseDto> getBoardWithCommentById(Long Id) {
        return null;
    }
}
