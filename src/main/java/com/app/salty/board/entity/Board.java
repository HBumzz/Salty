package com.app.salty.board.entity;

import com.app.salty.user.entity.Users;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@EntityListeners(AuditingEntityListener.class)
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="board_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name="member_id")
    private Users user;

    @Column(name ="board_header", nullable = false)
    private BoardHeader header;

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
}
