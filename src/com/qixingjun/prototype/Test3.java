package com.qixingjun.prototype;

import java.io.*;
import java.util.Date;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 通过序列化和反序列化来实现深复制
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        Date date = new Date(1254345464L);
        Sheep sheep = new Sheep("多利",date);
        System.out.println(sheep);
        System.out.println(sheep.getName());
        System.out.println(sheep.getBirthday());

        /**
         * 使用序列化和反序列化实现深复制
         */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(sheep);
        byte[] bytes = bos.toByteArray();
        oos.close();
        bos.close();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep sheep1 = (Sheep) ois.readObject();
        ois.close();
        bis.close();

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
