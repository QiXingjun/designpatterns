package com.qixingjun.builder;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public interface CarBuilder {
    Engine buildEngine();
    Seat buildSeat();
    Tyre buildTyre();
}
