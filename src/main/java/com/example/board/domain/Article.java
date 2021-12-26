package com.example.board.domain;

import com.example.board.dto.ArticleRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Article {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idx;

    @Column(nullable = false)
    private String content;

    public Article(ArticleRequestDto requestDto) {
        this.content = requestDto.getContent();
    }
}