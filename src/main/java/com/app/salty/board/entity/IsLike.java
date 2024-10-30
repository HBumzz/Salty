package com.app.salty.board.entity;

import com.app.salty.user.entity.Users;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class IsLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name="like_type", nullable = false)
    private Likes like;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private Users user;

    @Column(name="content_id")
    private Long contentId;
}
