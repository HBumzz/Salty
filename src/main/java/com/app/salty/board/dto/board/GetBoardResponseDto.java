package com.app.salty.board.dto.board;

import com.app.salty.board.entity.Board;
import com.app.salty.board.entity.BoardHeader;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.app.salty.util.DateFormatUtil.formatter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetBoardResponseDto {
    private Long boardId;
    private Long writerId;
    private String header;
    private String title;
    private String content;
    private String createdAt;
    private String updatedAt;


    public GetBoardResponseDto(Board board) {
        this.boardId=board.getId();
        this.writerId = board.getUser().getId();
        this.header = board.getHeader().getName();
        this.title = board.getTitle();
        this.content= board.getContent();
        this.createdAt =board.getCreatedAt().format(formatter);
        this.updatedAt =board.getUpdatedAt().format(formatter);
    }
}
