package com.liamz.controller;

import com.liamz.entites.Customer;
import com.liamz.mapper.UserCustom;
import com.liamz.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2021/10/10 17:27
 **/
@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;
    //@Autowired
    //private UserCustom userCustom;
    @GetMapping("/test")
    public List<Customer> getAllCustoms() {
        List<Customer> customerList = helloService.getAllCustomers();
        return customerList;
        //return userCustom.getOrders();
    }
}
