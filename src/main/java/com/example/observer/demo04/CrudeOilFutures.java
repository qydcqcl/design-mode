package com.example.observer.demo04;

import java.util.Observer;

/**
 * @author hzq
 * @date 2019/7/15 13:05
 */
public class CrudeOilFutures {

    public static void main(String[] args) {
        OilFutures oil=new OilFutures();
        //多方
        Observer bull=new Bull();
        //空方
        Observer bear=new Bear();
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
