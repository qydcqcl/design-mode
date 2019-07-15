package com.example.observer.demo04;

import java.util.Observable;

/**
 * 具体目标类：原油期货
 * @author hzq
 * @date 2019/7/15 13:05
 */
public class OilFutures extends Observable {

    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        ////设置内部标志位，注明数据发生变化
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }
}
