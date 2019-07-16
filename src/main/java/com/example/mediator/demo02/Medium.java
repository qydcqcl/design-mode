package com.example.mediator.demo02;

/**
 * 抽象中介者：中介公司
 * @author hzq
 * @date 2019/7/16 12:53
 */
public interface Medium {

    void register(Customer customer);
    void relay(String form, String ad);
}
