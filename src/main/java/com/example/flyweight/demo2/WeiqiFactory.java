package com.example.flyweight.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hzq
 * @date 2019/7/2 12:46
 */
public class WeiqiFactory {

    private List<ChessPieces> qz;

    public WeiqiFactory() {
        qz = new ArrayList<>();
        ChessPieces whitePieces = new WhitePieces();
        qz.add(whitePieces);
        ChessPieces blackPieces = new BlackPieces();
        qz.add(blackPieces);
    }

    public ChessPieces getChessPieces(String type){
        if("w".equalsIgnoreCase(type)){
            return qz.get(0);
        }else if("b".equalsIgnoreCase(type)){
            return qz.get(1);
        }else{
            return null;
        }
    }
}
