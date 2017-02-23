package com.qixingjun.prototype;

import java.util.Date;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description 测试原型模式(浅克隆)
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(1254345464L);
        Sheep sheep = new Sheep("多利",date);
        Sheep sheep1 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep.getName());
        System.out.println(sheep.getBirthday());

        date.setTime(79864534213L);
        System.out.println(sheep.getBirthday());

        System.out.println(sheep1);
        System.out.println(sheep1.getName());
        System.out.println(sheep1.getBirthday());

        sheep1.setName("多多利");
        System.out.println(sheep1);
        System.out.println(sheep1.getName());
        System.out.println(sheep1.getBirthday());
    }
}
