package com.qixingjun.builder;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        CarDirector director = new QxjCarDirector(new QxjCarBuilder());
        Car car = director.directCar();
        System.out.println(car.getEngine().getName());
        System.out.println(car.getSeat().getName());
        System.out.println(car.getTyre().getName());
        car.drive();
    }
}
