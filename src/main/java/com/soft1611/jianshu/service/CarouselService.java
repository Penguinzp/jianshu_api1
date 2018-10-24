package com.soft1611.jianshu.service;

import com.soft1611.jianshu.entity.Carousel;

import java.util.List;


public interface CarouselService {
    List<Carousel> findAll();

    Carousel findCarousel(String id);
}
