package com.example.mediator.demo02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 抽象同事类：客户
 * @author hzq
 * @date 2019/7/16 12:55
 */
public abstract class Customer extends JFrame implements ActionListener {

    protected Medium medium;
    protected String name;
    JTextField SentText;
    JTextArea ReceiveArea;

    public abstract void send(String ad);

    public abstract void receive(String from, String ad);

    public Customer(String name){
        super(name);
        this.name = name;
    }

    void clientWindow(int x, int y) {
        Container cp;
        JScrollPane sp;
        JPanel p1,p2;
        cp=this.getContentPane();
        SentText=new JTextField(18);
        ReceiveArea=new JTextArea(10,18);
        ReceiveArea.setEditable(false);
        p1=new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder("接收内容："));
        p1.add(ReceiveArea);
        sp=new JScrollPane(p1);
        cp.add(sp, BorderLayout.NORTH);
        p2=new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder("发送内容："));
        p2.add(SentText);
        cp.add(p2,BorderLayout.SOUTH);
        SentText.addActionListener(this);
        this.setLocation(x,y);
        this.setSize(250, 330);
        //窗口大小不可调整
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tempInfo = SentText.getText().trim();
        SentText.setText("");
        this.send(tempInfo);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }
}
