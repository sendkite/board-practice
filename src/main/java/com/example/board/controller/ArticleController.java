package com.example.board.controller;

import com.example.board.domain.Article;
import com.example.board.dto.ArticleRequestDto;
import com.example.board.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @PostMapping("/article")
    public Article savePost(@RequestBody ArticleRequestDto articleRequestDto) {
        return articleService.save(articleRequestDto);
    }

    @GetMapping("/article/{id}")
    public Article readPost(@PathVariable Long id) {
        return articleService.getPost(id);
    }
}
