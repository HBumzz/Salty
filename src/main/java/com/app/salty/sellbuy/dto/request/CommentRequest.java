package com.app.salty.sellbuy.dto.request;

import com.app.salty.sellbuy.entity.Comment; // Comment 엔티티 임포트
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CommentRequest {
    private String content;
    private Long articleId; // 댓글이 속하는 게시글 ID

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Comment toEntity() { // Comment 엔티티로 변환하는 메서드
        return Comment.builder()
                .content(content)
                .articleId(articleId)
                .build();
    }
}
