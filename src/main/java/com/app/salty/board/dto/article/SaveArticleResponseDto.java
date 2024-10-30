package com.app.salty.board.dto.article;

import com.app.salty.board.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static com.app.salty.util.DateFormatUtil.formatter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveArticleResponseDto {
    private Long boardId;
    private Long writerId;
    private String title;
    private String createdAt;

    public SaveArticleResponseDto(Article board) {
        this.boardId = board.getId();
        this.writerId= board.getUser().getId();
        this.title= board.getTitle();
        this.createdAt = board.getCreatedAt().format(formatter);
    }
}
