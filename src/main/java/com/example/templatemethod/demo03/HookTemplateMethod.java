package com.example.templatemethod.demo03;

/**
 * @author hzq
 * @date 2019/7/4 13:04
 */
public class HookTemplateMethod {

    public static void main(String[] args) {
        HookAbstractClass hookAbstractClass = new HookConcreteClass();
        hookAbstractClass.templateMethod();
    }
}
