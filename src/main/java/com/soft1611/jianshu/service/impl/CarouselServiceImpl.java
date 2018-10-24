package com.soft1611.jianshu.service.impl;

import com.soft1611.jianshu.dao.CarouselRepository;
import com.soft1611.jianshu.entity.Carousel;
import com.soft1611.jianshu.service.CarouselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class CarouselServiceImpl implements CarouselService {
    @Resource
    private CarouselRepository carouselRepository;
    @Override
    public List<Carousel> findAll() {
//        return carouselRepository.findAll();
        return carouselRepository.findAll();
    }

    @Override
    public Carousel findCarousel(String id) {
        return null;
    }

}
