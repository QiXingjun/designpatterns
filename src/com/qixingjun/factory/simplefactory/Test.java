package com.qixingjun.factory.simplefactory;

import com.qixingjun.factory.factorymethod.Audi;
import com.qixingjun.factory.factorymethod.Bmw;
import com.qixingjun.factory.factorymethod.Car;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description 没有使用简单工厂模式的情况下
 */
public class Test {
    public static void main(String[] args) {
        Car audi = new Audi();
        Car bmw = new Bmw();
        audi.run();
        bmw.run();
    }
}
