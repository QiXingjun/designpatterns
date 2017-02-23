package com.qixingjun.builder;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public class QxjCarBuilder implements CarBuilder {
    @Override
    public Engine buildEngine() {
        System.out.println("构建发动机");
        //这儿可以和工厂模式结合，这里为了简单演示，直接使用new
        return new Engine("齐行君牌发动机");
    }

    @Override
    public Seat buildSeat() {
        System.out.println("构建座椅");
        return new Seat("齐行君牌座椅");
    }

    @Override
    public Tyre buildTyre() {
        System.out.println("构建轮胎");
        return new Tyre("齐行君牌轮胎");
    }
}
