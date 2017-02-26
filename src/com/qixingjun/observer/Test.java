package com.qixingjun.observer;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/26
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        //目标对象
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //创建多个观察者
        SubObserver subObserver1 = new SubObserver();
        SubObserver subObserver2 = new SubObserver();
        SubObserver subObserver3 = new SubObserver();

        //将这3个观察者添加到subject对象的观察者队伍中
        concreteSubject.registerObserver(subObserver1);
        concreteSubject.registerObserver(subObserver2);
        concreteSubject.registerObserver(subObserver3);

        //改变subject的状态
        concreteSubject.setState(666);

        //注意观察观察者的状态是不是也发生了改变
        System.out.println(subObserver1.getMyState());
        System.out.println(subObserver2.getMyState());
        System.out.println(subObserver3.getMyState());

        //改变subject的状态
        concreteSubject.setState(999);

        //注意观察观察者的状态是不是也发生了改变
        System.out.println(subObserver1.getMyState());
        System.out.println(subObserver2.getMyState());
        System.out.println(subObserver3.getMyState());
    }
}
