package com.itheima.crm.service.impl;

import com.itheima.crm.bean.Customer;
import com.itheima.crm.dao.CustomerMapper;
import com.itheima.crm.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public  List<Customer>  finaAll(){
       return  customerMapper.findAll();
    }
}
