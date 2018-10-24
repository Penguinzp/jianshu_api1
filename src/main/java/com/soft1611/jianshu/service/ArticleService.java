package com.soft1611.jianshu.service;

import com.soft1611.jianshu.entity.Article;

import java.util.List;


public interface ArticleService {
    List<Article> findAll();
    Article findArticle(String id);
}
