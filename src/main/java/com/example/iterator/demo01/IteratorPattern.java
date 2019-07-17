package com.example.iterator.demo01;

/**
 * @author hzq
 * @date 2019/7/17 12:28
 */
public class IteratorPattern {

    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("韶关学院");
        System.out.print("聚合的内容有：");

        Iterator iterator = ag.getIterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next.toString() + "\t");
        }
        Object first = iterator.first();
        System.out.println("\nfirst: " + first.toString());
    }
}
