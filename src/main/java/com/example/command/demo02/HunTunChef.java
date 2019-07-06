package com.example.command.demo02;

import javax.swing.*;

/**
 * 接收者：馄饨厨师
 * @author hzq
 * @date 2019/7/6 13:14
 */
public class HunTunChef extends JFrame {
    JLabel l=new JLabel();

    public HunTunChef() {
        super("煮馄饨");
        l.setIcon(new ImageIcon("design-mode/src/main/resources/command/HunTun.jpg"));
        this.add(l);
        this.setLocation(350, 50);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void cooking() {
        this.setVisible(true);
    }
}
