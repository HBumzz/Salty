package com.app.salty.sellbuy.entity;

import com.app.salty.user.entity.Users;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.StringReader;

@Entity
@Getter
@NoArgsConstructor
public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "image") // image url
    private String image;

    @Column(name = "category", nullable = false)
    private Long category;

    @Column(name = "created_date")
    @CreatedDate
    private String createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate
    private String modifiedDate;

    // user id값
    // @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private Users user;

    @Column(name = "region", nullable = false)
    private String region;

    @Builder
    public Articles(String title, String content, String image, Long category, String createdDate, String modifiedDate, String region) {
        this.title = title;
        this.content = content;
        this.image = image;
        this.category = category;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.region = region;
    }

}
