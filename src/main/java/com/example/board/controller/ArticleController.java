package com.example.board.controller;

import com.example.board.domain.Article;
import com.example.board.domain.Comment;
import com.example.board.dto.ArticleCommentRequestDto;
import com.example.board.dto.ArticleRequestDto;
import com.example.board.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @PostMapping("/article")
    public Article savePost(@RequestBody ArticleRequestDto articleRequestDto) {
        return articleService.save(articleRequestDto);
    }

    @GetMapping("/articles")
    public List<Article> readPostList() {
        return articleService.getPosts();
    }


    @GetMapping("/article/{id}")
    public Article readPost(@PathVariable Long id) {
        return articleService.getPost(id);
    }


    @PostMapping("/article/comment")
    public void setArticleComment(@RequestBody ArticleCommentRequestDto articleCommentRequestDto) {
        articleService.setArticleComment(articleCommentRequestDto);
    }

    @GetMapping("/article/comment")
    public Optional<Comment> getArticleComment(Long id) {
        return articleService.getArticleComment(id);
    }
}
