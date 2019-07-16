package com.example.mediator.demo02;

/**
 * @author hzq
 * @date 2019/7/16 12:52
 */
public class DatingPlatform {

    public static void main(String[] args) {
        //房产中介
        Medium md = new EstateMedium();
        Customer member1,member2;
        member1 = new Seller("张三(卖方)");
        member2 = new Buyer("李四(买方)");
        //客户注册
        md.register(member1);
        md.register(member2);
    }
}
