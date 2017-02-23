package com.qixingjun.factory.factorymethod;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Car audi = new AudiFactory().createCar();
        Car bmw = new BmwFactory().createCar();
        audi.run();
        bmw.run();
    }
}
