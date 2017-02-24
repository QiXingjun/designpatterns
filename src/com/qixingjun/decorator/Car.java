package com.qixingjun.decorator;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 具体构件角色
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("陆地上跑！");
    }
}
