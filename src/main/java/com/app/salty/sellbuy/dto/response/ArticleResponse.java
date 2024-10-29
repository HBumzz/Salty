package com.app.salty.sellbuy.dto.response;

import com.app.salty.sellbuy.entity.Articles;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ArticleResponse {
    private Long id;
    private String title;
    private String content;
    private String image;
    private Long category;
    private String createdDate;
    private String modifiedDate;
    private String region;

    public ArticleResponse(Articles article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.image = article.getImage();
        this.category = article.getCategory();
        this.createdDate = article.getCreatedDate();
        this.modifiedDate = article.getModifiedDate();
        this.region = article.getRegion();
    }
}
