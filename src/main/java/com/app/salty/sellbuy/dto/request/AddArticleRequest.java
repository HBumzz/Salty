package com.app.salty.sellbuy.dto.request;

import com.app.salty.sellbuy.entity.Articles;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class AddArticleRequest {
    private String title;
    private String content;
    private String image;
    private Long category;
    private String region;
    public Articles toEntity() {
        return Articles.builder()
                .title(title)
                .content(content)
                .image(image)
                .category(category)
                .region(region)
                .build();
    }
}
