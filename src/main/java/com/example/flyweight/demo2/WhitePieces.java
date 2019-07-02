package com.example.flyweight.demo2;

import java.awt.*;

/**
 * @author hzq
 * @date 2019/7/2 12:44
 */
public class WhitePieces implements ChessPieces {

    @Override
    public void downPieces(Graphics graphics, Point point) {
        graphics.setColor(Color.WHITE);
        graphics.fillOval(point.x, point.y, 30, 30);
    }
}
