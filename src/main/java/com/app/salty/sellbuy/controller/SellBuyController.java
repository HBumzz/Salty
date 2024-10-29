package com.app.salty.sellbuy.controller;

import com.app.salty.sellbuy.dto.request.AddArticleRequest;
import com.app.salty.sellbuy.dto.response.ArticleResponse;
import com.app.salty.sellbuy.entity.Articles; // 엔티티 import
import com.app.salty.sellbuy.service.SellBuyService; // 서비스 import
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
public class SellBuyController {
    private final SellBuyService sellBuyService;

    public SellBuyController(SellBuyService sellBuyService) {
        this.sellBuyService = sellBuyService;
    }


    @PostMapping("/api/articles")
    public ResponseEntity<Articles> addArticle(@RequestBody AddArticleRequest request) {
        Articles savedArticle = sellBuyService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);
    }
    @GetMapping("/api/articles")
    public ResponseEntity<List<ArticleResponse>> findAllArticles() {
        List<ArticleResponse> list = sellBuyService.findAll()
                .stream()
                .map(ArticleResponse::new)
                .toList();
        return ResponseEntity.status(HttpStatus.OK)
                .body(list);
    }
}
