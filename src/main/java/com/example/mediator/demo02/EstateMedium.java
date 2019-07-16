package com.example.mediator.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hzq
 * @date 2019/7/16 13:06
 */
public class EstateMedium implements Medium {

    private List<Customer> customers = new ArrayList<>();

    @Override
    public void register(Customer customer) {
        if(!customers.contains(customer)){
            customers.add(customer);
            customer.setMedium(this);
        }
    }

    @Override
    public void relay(String form, String ad) {
        for(Customer customer : customers){
            String name = customer.getName();
            if(!name.equals(form)){
                customer.receive(form, ad);
            }
        }
    }
}
