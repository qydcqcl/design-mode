package com.example.interpreter.demo02;

import java.util.HashSet;
import java.util.Set;

/**
 * 终结符表达式类
 * @author hzq
 * @date 2019/7/20 12:55
 */
public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        for(int i = 0; i < data.length; i++){
            set.add(data[i]);
        }
    }

    @Override
    public boolean interpret(String info) {
        if(set.contains(info)){
            return true;
        }else{
            return false;
        }
    }
}
