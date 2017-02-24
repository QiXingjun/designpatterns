package com.qixingjun.decorator;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加飞行功能...");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("在飞行的基础上，增加水里游功能...");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();

        System.out.println("一次增加两个功能：飞和自动驾驶");
        AiCar aiCar = new AiCar(new FlyCar(new Car()));
        aiCar.move();
    }
}
