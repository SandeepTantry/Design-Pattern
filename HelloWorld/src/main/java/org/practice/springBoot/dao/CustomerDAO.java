package org.practice.springBoot.dao;

import static java.util.stream.Collectors.toList;

import static org.apache.commons.collections4.MapUtils.isNotEmpty;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import org.practice.springBoot.model.Customer;

@Repository
public class CustomerDAO
{
    private static final String SQL = "select * from customers";

    private static final Predicate<Map<String, Object>> REMOVE_EMPTY = new Predicate<Map<String, Object>>() {
        
        @Override
        public boolean test(final Map<String, Object> cust)
        {
            return isNotEmpty(cust);
        }
    };

    private static final Function<Map<String, Object>, Customer> TO_CUSTOMER = new Function<Map<String, Object>, Customer>() {
        
        @Override
        public Customer apply(final Map<String, Object> data)
        {
            final Customer customer = new Customer();
            customer.setName((String) data.get("name"));
            customer.setId((Long) data.get("id"));
            customer.setAddr((String) data.get("addr"));

            return customer;
        }
    };

    @Autowired
    private JdbcTemplate template;
    
    public List<Customer> getData()
    {
        final List<Map<String, Object>> data = template.queryForList(SQL);
        final List<Customer> list = data.stream().filter(REMOVE_EMPTY).map(TO_CUSTOMER).collect(toList());

        return list;
    }
}
