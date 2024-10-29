package com.app.salty.board.dto.board;

import com.app.salty.board.entity.Board;
import com.app.salty.board.entity.BoardHeader;
import com.app.salty.user.entity.Users;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SaveBoardRequestDto {

    private Users user;
    private BoardHeader header;
    private String title;
    private String content;

    public Board toEntity(){
        return new Board(user,header,title,content);
    }
}
