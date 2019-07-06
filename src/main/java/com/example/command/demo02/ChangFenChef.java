package com.example.command.demo02;

import javax.swing.*;

/**
 * 接受者：肠粉厨师
 * @author hzq
 * @date 2019/7/6 13:12
 */
public class ChangFenChef extends JFrame {

    JLabel l = new JLabel();
    public ChangFenChef() {
        super("煮肠粉");
        l.setIcon(new ImageIcon("design-mode/src/main/resources/command/ChangFen.jpg"));
        this.add(l);
        this.setLocation(30, 30);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void cooking(){
        this.setVisible(true);
    }
}
