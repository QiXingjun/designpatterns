package com.qixingjun.iterator;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMyAggregate concreteMyAggregate = new ConcreteMyAggregate();
        concreteMyAggregate.addObject("aaa");
        concreteMyAggregate.addObject("bbb");
        concreteMyAggregate.addObject("ccc");
        concreteMyAggregate.addObject("ddd");

        MyIterator myIterator = concreteMyAggregate.createIterator();
        while(myIterator.hasNext()){
            System.out.println(myIterator.getCurrentObj());
            myIterator.next();
        }
    }
}
