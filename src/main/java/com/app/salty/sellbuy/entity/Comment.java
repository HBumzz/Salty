package com.app.salty.sellbuy.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "comments") // 테이블 이름 설정
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id; // 댓글 ID

    @Column(nullable = false)
    private String content; // 댓글 내용

    @Column(name = "article_id", nullable = false)
    private Long articleId; // 댓글이 속하는 게시글 ID

    // 생성자
    @Builder
    public Comment(String content, Long articleId) {
        this.content = content;
        this.articleId = articleId;
    }

    // 댓글 내용 업데이트 메서드
    public void updateContent(String content) {
        this.content = content;
    }
}
