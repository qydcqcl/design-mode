package com.example.composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hzq
 * @date 2019/6/28 19:35
 */
public class Composite implements Component {

    private List<Component> children = new ArrayList<>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChile(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for(Component component : children){
            component.operation();
        }
    }
}
