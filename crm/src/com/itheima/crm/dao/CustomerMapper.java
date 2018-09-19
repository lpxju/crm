package com.itheima.crm.dao;

import com.itheima.crm.bean.Customer;

import java.util.List;

public interface CustomerMapper {
    /**
     * 查询所有客户
     * @return
     */
    public List<Customer> findAll();
}
