package com.example.board.controller;

import com.example.board.domain.Article;
import com.example.board.dto.ArticleCommentRequestDto;
import com.example.board.dto.ArticleRequestDto;
import com.example.board.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    public Article getArticleComment(@RequestParam Long idx) {
        return articleService.getArticleComment(idx);
    }

    @GetMapping("/page")
    public Page<Article> find(Pageable pageable) {
        return articleService.find(pageable);
    }

}
