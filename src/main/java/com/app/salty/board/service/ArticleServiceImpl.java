package com.app.salty.board.service;

import com.app.salty.board.dto.article.*;
import com.app.salty.board.dto.comment.GetCommentResponseDto;
import com.app.salty.board.entity.Article;
import com.app.salty.board.entity.Comment;
import com.app.salty.board.repository.ArticleRepository;
import com.app.salty.board.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    ArticleRepository articleRepository;
    CommentRepository commentRepository;

    ArticleServiceImpl(ArticleRepository articleRepository, CommentRepository commentRepository) {
        this.articleRepository = articleRepository;
        this.commentRepository = commentRepository;
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
    public UpdateArticleResponseDto updateArticle(UpdateArticleRequestDto dto, Long articleId)  {

        Article article = articleRepository.findById(articleId).orElseThrow(IllegalArgumentException::new);
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
    public List<GetArticleResponseDto> getArticlesByUserId(Long userId) {
        List<Article> list = articleRepository.findArticlesByUserId(userId);
        return list.stream().map(GetArticleResponseDto::new).toList();
    }

    @Override
    public GetArticleWithCommentResponseDto getArticleWithCommentByArticleId(Long articleId) {
        Article article = articleRepository.findById(articleId).orElseThrow(IllegalArgumentException::new);
        List<Comment> commentList = commentRepository.findCommentsByArticle_Id(articleId);
        List<GetCommentResponseDto> commentResponseDtoList = commentList.stream().map(GetCommentResponseDto::new).toList();
        return new GetArticleWithCommentResponseDto(article,commentResponseDtoList);
    }
}
