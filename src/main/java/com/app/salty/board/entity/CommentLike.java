package com.app.salty.board.entity;

import com.app.salty.user.entity.Users;
import jakarta.persistence.*;

@Entity
public class CommentLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;
}
