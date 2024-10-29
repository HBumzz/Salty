package com.app.salty.sellbuy.service;

import com.app.salty.sellbuy.entity.Articles;
import com.app.salty.sellbuy.repository.SellBuyRepository;
import com.app.salty.sellbuy.dto.request.AddArticleRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellBuyService {
    private final SellBuyRepository sellbuyRepository;

    public SellBuyService(SellBuyRepository sellbuyRepository) {
        this.sellbuyRepository = sellbuyRepository;
    }

    public Articles save(AddArticleRequest request) {  // Users 객체 추가
        Articles article = request.toEntity(); // DTO에서 엔티티 변환
        return sellbuyRepository.save(article);
    }
    public List<Articles> findAll() {
        return sellbuyRepository.findAll();
    }
}
