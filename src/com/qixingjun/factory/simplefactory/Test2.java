package com.qixingjun.factory.simplefactory;

import com.qixingjun.factory.factorymethod.Car;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description 使用简单工厂模式的情况下
 */
public class Test2 {
    public static void main(String[] args) {
        Car audi = CarFactory.createCar("奥迪");
        Car bmw = CarFactory.createCar("宝马");
        audi.run();
        bmw.run();


        Car audi2 = CarFactory2.createAudi();
        Car bmw2 = CarFactory2.createBmw();
        audi2.run();
        bmw2.run();
    }
}
