package com.example.templatemethod.demo01;

/**
 * @author hzq
 * @date 2019/7/4 12:46
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
