package com.qixingjun.prototype;

import java.util.Date;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description 测试原型模式(深克隆)
 */
public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(1254345464L);
        Sheep2 sheep = new Sheep2("多利",date);
        Sheep2 sheep1 = (Sheep2) sheep.clone();
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
