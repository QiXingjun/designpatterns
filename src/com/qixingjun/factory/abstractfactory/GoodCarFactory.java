package com.qixingjun.factory.abstractfactory;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public class GoodCarFactory implements CarFactory {
    @Override
    public Engine createEnginee() {
        return new GoodEngine();
    }

    @Override
    public Seat createSeat() {
        return new GoodSeat();
    }

    @Override
    public Tyre createTyre() {
        return new GoodTyre();
    }
}
