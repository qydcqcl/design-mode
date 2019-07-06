package com.example.strategy.demo02;

import javax.swing.*;

/**
 * 具体策略类：红烧大闸蟹
 * @author hzq
 * @date 2019/7/5 13:19
 */
public class BraisedCrabs extends JLabel implements CrabCooking {

    @Override
    public void cookingMethod() {
        this.setIcon(new ImageIcon("design-mode\\src\\main\\resources\\strategy\\BraisedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
