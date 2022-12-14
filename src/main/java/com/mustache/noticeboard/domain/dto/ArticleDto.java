package com.mustache.noticeboard.domain.dto;

import com.mustache.noticeboard.domain.entity.Article;
import lombok.*;


@AllArgsConstructor
@Getter
@ToString
public class ArticleDto {
    private Long id;
    private String title;
    private String content;


    public Article toEntity() {
        return new Article(this.id, this.title, this.content);
    }
}
