package com.app.salty.board.repository;

import com.app.salty.board.entity.IsLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IsLikeRepository extends JpaRepository<Long, IsLike> {
}
