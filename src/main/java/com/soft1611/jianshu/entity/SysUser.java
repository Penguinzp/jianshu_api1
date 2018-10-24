package com.soft1611.jianshu.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
@Builder
public class SysUser {
    @Id
    @GeneratedValue
    private Integer userId;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private String nickname;
    private String avatar;
    private String description;
    private Integer wordsCount;
    private Integer likeCount;

    public SysUser(){

    }

    public SysUser(String email, String password, String nickname, String avatar, String description, Integer wordsCount, Integer likeCount) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
        this.description = description;
        this.wordsCount = wordsCount;
        this.likeCount = likeCount;
    }
}
