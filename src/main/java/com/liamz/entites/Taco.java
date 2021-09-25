package com.liamz.entites;

import lombok.Data;

import java.util.List;

/**
 * @Description 定义taco设计的领域对象
 * @Author liam661
 * @Date 2021/9/17 22:30
 **/
@Data
public class Taco {
    private String name;
    private List<String> ingredients;
}
