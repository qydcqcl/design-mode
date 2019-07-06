package com.example.strategy.demo02;

import javax.swing.*;

/**
 * 具体策略类：清蒸大闸蟹
 * @author hzq
 * @date 2019/7/5 13:17
 */
public class SteamedCrabs extends JLabel  implements CrabCooking {

    @Override
    public void cookingMethod() {
        this.setIcon(new ImageIcon("design-mode\\src\\main\\resources\\strategy\\SteamedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
