package com.qixingjun.factory.abstractfactory;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public class BadCarFactory implements CarFactory {
    @Override
    public Engine createEnginee() {
        return new BadEngine();
    }

    @Override
    public Seat createSeat() {
        return new BadSeat();
    }

    @Override
    public Tyre createTyre() {
        return new BadTyre();
    }
}
