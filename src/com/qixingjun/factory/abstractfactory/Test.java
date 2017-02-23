package com.qixingjun.factory.abstractfactory;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        CarFactory goodCarFactory = new GoodCarFactory();
        Engine engine = goodCarFactory.createEnginee();
        engine.run();
        engine.start();

        CarFactory badCarFactory = new BadCarFactory();
        Tyre tyre = badCarFactory.createTyre();
        tyre.revolve();
    }
}
