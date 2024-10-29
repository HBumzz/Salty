package com.app.salty.board.repository;

import com.app.salty.board.entity.BoardLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardIsLikeRepository extends JpaRepository<Long, BoardLike> {
}
