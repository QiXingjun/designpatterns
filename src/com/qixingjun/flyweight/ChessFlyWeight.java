package com.qixingjun.flyweight;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 享元接口
 */
public interface ChessFlyWeight {
    String getColor();
    void display(Coordinate coordinate);
}
