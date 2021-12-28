package com.example.board.service;

import com.example.board.domain.Article;
import com.example.board.domain.Comment;
import com.example.board.dto.ArticleCommentRequestDto;
import com.example.board.dto.ArticleRequestDto;
import com.example.board.repository.ArticleRepository;
import com.example.board.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    private final CommentRepository commentRepository;

    public Article save(ArticleRequestDto articleRequestDto) {
        Article article = new Article(articleRequestDto);
        articleRepository.save(article);
        return article;
    }

    public List<Article> getPosts() {
        return articleRepository.findAll();
    }


    public Article getPost(Long id) {
        return articleRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 게시글이 존재하지 않습니다.")
        );
    }

    public void setArticleComment(ArticleCommentRequestDto articleCommentRequestDto) {
        Article article = articleRepository.findById(articleCommentRequestDto.getIdx()).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        Comment comment = new Comment(articleCommentRequestDto, article);
        commentRepository.save(comment);
    }

    public Article getArticleComment(Long idx) {
        return articleRepository.findById(idx).orElseThrow(
                () -> new NullPointerException("해당 게시글이 존재하지 않습니다.")
        );
    }
}
