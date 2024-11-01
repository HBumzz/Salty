package com.app.salty.board.dto.article;

import com.app.salty.board.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static com.app.salty.util.DateFormatUtil.formatter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetArticleResponseDto {
    private Long articleId;
    private Long writerId;
    private String header;
    private String title;
    private String content;
    private String createdAt;
    private String updatedAt;


    public GetArticleResponseDto(Article article) {
        this.articleId =article.getId();
        this.writerId = article.getUser().getId();
        this.header = article.getHeader().getName();
        this.title = article.getTitle();
        this.content= article.getContent();
        this.createdAt =article.getCreatedAt().format(formatter);
        this.updatedAt =article.getUpdatedAt().format(formatter);
    }
}