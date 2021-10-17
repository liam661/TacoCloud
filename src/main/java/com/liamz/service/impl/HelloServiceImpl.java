package com.liamz.service.impl;

import com.liamz.entites.Customer;
import com.liamz.mapper.UserCustom;
import com.liamz.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2021/10/10 17:31
 **/
@Service
@Transactional
public class HelloServiceImpl implements HelloService {
    @Autowired
    private UserCustom userCustom;

    @Override
    public List<Customer> getAllCustomers()
    {
        return userCustom.getOrders();
        //return null;
    }
}
