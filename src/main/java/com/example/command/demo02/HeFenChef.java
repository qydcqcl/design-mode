package com.example.command.demo02;

import javax.swing.*;

/**
 * 接收者：河粉厨师
 * @author hzq
 * @date 2019/7/6 13:15
 */
public class HeFenChef extends JFrame {
    JLabel l=new JLabel();

    public HeFenChef() {
        super("煮河粉");
        l.setIcon(new ImageIcon("design-mode/src/main/resources/command/HeFen.jpg"));
        this.add(l);
        this.setLocation(200, 280);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void cooking() {
        this.setVisible(true);
    }
}
