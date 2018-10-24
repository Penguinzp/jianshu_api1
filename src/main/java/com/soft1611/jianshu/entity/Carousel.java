package com.soft1611.jianshu.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Data
public class Carousel implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String carouselSrc;

    public Carousel(String carouselSrc) {
        this.carouselSrc = carouselSrc;
    }

    public Carousel() {
    }
}
