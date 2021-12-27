package com.example.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleCommentRequestDto {
    private Long idx;
    private String comment;
}
