package com.app.salty.board.entity;

import com.app.salty.user.entity.Users;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EntityListeners(AuditingEntityListener.class)
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="board_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private Users user;

    @Enumerated(EnumType.STRING)
    @Column(name ="board_header", nullable = false)
    private ArticleHeader header;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @CreatedDate
    @Column(name="created-at")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name="updated-at")
    private LocalDateTime updatedAt;

    public Article(Users user, ArticleHeader header, String title, String content) {
        this.user = user;
        this.header=header;
        this.title=title;
        this.content=content;
    }
}
