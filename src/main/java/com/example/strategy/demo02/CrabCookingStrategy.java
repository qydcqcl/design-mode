package com.example.strategy.demo02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author hzq
 * @date 2019/7/5 13:23
 */
public class CrabCookingStrategy implements ItemListener {

    private JFrame f;
    private JRadioButton qz,hs;
    private JPanel CenterJP, SouthJP;
    private Kitchen cf;
    private CrabCooking qzx, hsx;

    public CrabCookingStrategy() {
        f = new JFrame("策略模式在大闸蟹做菜中的应用");
        f.setBounds(100,100,500,400);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SouthJP = new JPanel();
        CenterJP = new JPanel();
        f.add("South",SouthJP);
        f.add("Center",CenterJP);
        qz = new JRadioButton("清蒸大闸蟹");
        hs = new JRadioButton("红烧大闸蟹");
        qz.addItemListener(this);
        hs.addItemListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(qz);
        group.add(hs);
        SouthJP.add(qz);
        SouthJP.add(hs);
        cf = new Kitchen();
        qzx = new SteamedCrabs();
        hsx = new BraisedCrabs();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton jc = (JRadioButton) e.getSource();
        if(jc == qz) {
            cf.setCrabCooking(qzx);
            cf.cookingMethod();
        }
        else if(jc == hs) {
            cf.setCrabCooking(hsx);
            cf.cookingMethod();
        }
        CenterJP.removeAll();
        CenterJP.repaint();
        CenterJP.add((Component) cf.getCrabCooking());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CrabCookingStrategy();
    }
}
