package com.liamz.entites;

import lombok.Data;

/**
 * @Description
 * @Author liam661
 * @Date 2021/9/27 21:36
 **/
@Data
public class Order {
    private String name;
    private String Street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
