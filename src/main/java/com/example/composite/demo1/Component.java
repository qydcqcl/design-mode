package com.example.composite.demo1;

/**
 * @author hzq
 * @date 2019/6/28 19:32
 */
public interface Component {

    void add(Component component);
    void remove(Component component);
    Component getChile(int i);
    void operation();
}
