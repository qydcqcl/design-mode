package com.example.composite.demo1;

/**
 * @author hzq
 * @date 2019/6/28 13:25
 */
public class CompositePattern {

    public static void main(String[] args) {
        Component component = new Composite();
        Component component1 = new Composite();
        Component leaf = new Leaf("1");
        Component leaf1 = new Leaf("2");
        Component leaf2 = new Leaf("3");
        component.add(leaf);
        component.add(component1);

        component1.add(leaf1);
        component1.add(leaf2);

        component.operation();
    }
}
