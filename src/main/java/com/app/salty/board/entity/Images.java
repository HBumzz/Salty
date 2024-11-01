package com.app.salty.board.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="image_id")
    private Long id;

    @Column(name="originFileName", nullable = false)
    private String originFileName;

    @Column(name="storedFileName", nullable = false)
    private String storedFileName;

    @Column(name="filePath", nullable = false)
    private String filePath;

    @Column(name="fileSize")
    private Long fileSize;

    @Column(name="fileExtension")
    private String fileExtension;

    @ManyToOne
    @JoinColumn(name="article_id")
    private Article article;

}
