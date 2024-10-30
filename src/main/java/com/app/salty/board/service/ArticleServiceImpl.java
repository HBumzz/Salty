package com.app.salty.board.service;

import com.app.salty.board.dto.article.*;
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
    public List<GetArticleResponseDto> getArticleList() {
        List<Article> list = articleRepository.findAll();
        return list.stream().map(GetArticleResponseDto::new).toList();
    }

    @Override
    public GetArticleResponseDto getArticleById(Long id) {
        Article article = articleRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        return new GetArticleResponseDto(article);
    }

    @Override
    public SaveArticleResponseDto saveArticle(SaveArticleRequestDto dto) {
        Article article = articleRepository.save(dto.toEntity());
        return new SaveArticleResponseDto(article);
    }

    @Override
    public UpdateArticleResponseDto updateArticle(UpdateArticleRequestDto dto)  {

        Article article = articleRepository.findById(dto.getId()).orElseThrow(IllegalArgumentException::new);
        article.setHeader(dto.getHeader());
        article.setTitle(dto.getTitle());
        article.setContent(dto.getContent());

        Article newArticle = articleRepository.save(article);
        return new UpdateArticleResponseDto(newArticle);
    }

    @Override
    public void deleteArticle(Long id) {
        articleRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        articleRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<List<GetArticleResponseDto>> getArticleListById(Long Id) {
        return null;
    }

    @Override
    public ResponseEntity<GetArticleWithCommentResponseDto> getArticleWithCommentById(Long Id) {
        return null;
    }
}
