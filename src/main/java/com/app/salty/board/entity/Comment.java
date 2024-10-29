package com.app.salty.board.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="board_id")
    private Board board;

    @Column(name ="body" ,nullable = false)
    private String body;

    @CreatedDate
    @Column(name="created-at")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name="updated-at")
    private LocalDateTime updatedAt;

}
