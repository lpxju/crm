package com.itheima.crm.service;

import com.itheima.crm.bean.Customer;

import java.util.List;

public interface ICustomerService {

    /**
     * 查询所有
     * @return
     */
    public List<Customer> finaAll();
}
