package com.qixingjun.decorator;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 装饰器
 */
public class SuperCar implements ICar {
    protected Car car;

    public SuperCar(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
