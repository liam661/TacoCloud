package com.liamz.mapper;

import com.liamz.entites.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserCustom {
    public List<Customer> getOrders();
}
