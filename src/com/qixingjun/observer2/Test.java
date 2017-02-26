package com.qixingjun.observer2;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/26
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        //创建目标对象
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //创建观察者对象
        SubObserver subObserver1 = new SubObserver();
        SubObserver subObserver2 = new SubObserver();
        SubObserver subObserver3 = new SubObserver();

        //将上面三个观察者对象添加到目标对象subject的观察者容器中
        concreteSubject.addObserver(subObserver1);
        concreteSubject.addObserver(subObserver2);
        concreteSubject.addObserver(subObserver3);

        //改变subject的状态
        concreteSubject.setState(666);

        //观察者的状态是否发生了改变？：是的
        System.out.println(subObserver1.getMyState());
        System.out.println(subObserver2.getMyState());
        System.out.println(subObserver3.getMyState());
    }
}
