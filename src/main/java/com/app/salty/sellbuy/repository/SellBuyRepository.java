package com.app.salty.sellbuy.repository;

import com.app.salty.sellbuy.entity.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import com.app.salty.sellbuy.entity.Articles;
import java.util.List;
public interface SellBuyRepository extends JpaRepository<Articles, Long> {
    List<Articles> findAll();
}
