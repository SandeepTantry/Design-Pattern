package org.practice.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.practice.springBoot.dao.CustomerDAO;
import org.practice.springBoot.model.Customer;

@RestController
public class CustomerController
{
    @Autowired
    private CustomerDAO dao;
    
    @RequestMapping("/getCusts")
    public List<Customer> getCustomers()
    {
        return dao.getData();
    }
}
