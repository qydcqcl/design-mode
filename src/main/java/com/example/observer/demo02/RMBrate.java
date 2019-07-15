package com.example.observer.demo02;

/**
 * @author hzq
 * @date 2019/7/15 12:38
 */
public class RMBrate extends Rate {

    @Override
    public void change(int number) {
        for(Company company : companies){
            company.response(number);
        }
    }
}
