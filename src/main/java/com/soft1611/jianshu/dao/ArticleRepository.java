package com.soft1611.jianshu.dao;

import com.soft1611.jianshu.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepository extends JpaRepository<Article,String> {

}
