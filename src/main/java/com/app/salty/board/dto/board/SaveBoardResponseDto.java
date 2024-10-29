package com.app.salty.board.dto.board;

import com.app.salty.board.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import static com.app.salty.util.DateFormatUtil.formatter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveBoardResponseDto {
    private Long boardId;
    private Long writerId;
    private String title;
    private String createdAt;

    public SaveBoardResponseDto(Board board) {
        this.boardId = board.getId();
        this.writerId= board.getUser().getId();
        this.title= board.getTitle();
        this.createdAt = board.getCreatedAt().format(formatter);
    }
}
