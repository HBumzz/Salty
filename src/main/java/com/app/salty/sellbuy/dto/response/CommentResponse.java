package com.app.salty.sellbuy.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommentResponse {
    private Long id; // 댓글 ID
    private String content; // 댓글 내용
    private Long articleId; // 게시글 ID
}
