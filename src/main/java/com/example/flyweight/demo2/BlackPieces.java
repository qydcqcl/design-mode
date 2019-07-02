package com.example.flyweight.demo2;

import java.awt.*;

/**
 * @author hzq
 * @date 2019/7/2 12:45
 */
public class BlackPieces implements ChessPieces {

    @Override
    public void downPieces(Graphics graphics, Point point) {
        graphics.setColor(Color.BLACK);
        graphics.fillOval(point.x, point.y, 30, 30);
    }
}
