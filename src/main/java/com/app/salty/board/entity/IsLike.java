package com.app.salty.board.entity;

import com.app.salty.user.entity.Users;
import jakarta.persistence.*;

@Entity
public class IsLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board boardId;
}
