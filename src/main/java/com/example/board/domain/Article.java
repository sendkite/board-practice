package com.example.board.domain;

import com.example.board.dto.ArticleRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Article extends Timestamped{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idx;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @OneToMany(mappedBy="article")
    private List<Comment> comments;

    public Article(ArticleRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }
}