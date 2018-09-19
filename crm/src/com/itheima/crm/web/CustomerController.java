package com.itheima.crm.web;

import com.itheima.crm.bean.Customer;
import com.itheima.crm.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.Serializable;
import java.util.List;

@Controller
public class CustomerController implements Serializable {
    @Autowired
    private ICustomerService customerServiceImpl;


    @RequestMapping(value = "/customerFindAll.action")
    public ModelAndView queryPage() {
        List<Customer> list = customerServiceImpl.finaAll();

        ModelAndView md = new ModelAndView();
        md.setViewName("customer");
        return md;
    }


}
