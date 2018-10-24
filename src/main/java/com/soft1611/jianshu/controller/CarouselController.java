package com.soft1611.jianshu.controller;

import com.soft1611.jianshu.service.CarouselService;
import com.soft1611.jianshu.utils.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/carousel")
@CrossOrigin("http://localhost")
public class CarouselController {
    @Resource
    private CarouselService carouselService;

    @GetMapping()
    public ResponseUtil getCarousels() {
        return new ResponseUtil(0, "get carousels", carouselService.findAll());
    }
}
