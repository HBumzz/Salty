package com.app.salty.board.dto.article;

import com.app.salty.board.entity.Article;
import com.app.salty.board.entity.ArticleHeader;
import com.app.salty.user.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateArticleRequestDto {
    private Long id;
    private Users user;
    private ArticleHeader header;
    private String title;
    private String content;
}
