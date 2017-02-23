package com.qixingjun.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/22
 * @Description
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //饿汉模式
        HungrySingleton s1 = HungrySingleton.getInstance();
        HungrySingleton s2 = HungrySingleton.getInstance();
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);


        //懒汉模式
        LazySingleton s3 = LazySingleton.getInstance();
        LazySingleton s4 = LazySingleton.getInstance();
        System.out.println("s3:"+s3);
        System.out.println("s4:"+s4);

        //静态内部类模式
        StaticInnerClassSingleton s5 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton s6 = StaticInnerClassSingleton.getInstance();
        System.out.println("s5:"+s5);
        System.out.println("s6:"+s6);

        //枚举单例模式
        EnumSingleton s7 = EnumSingleton.INSTANCE;
        EnumSingleton s8 = EnumSingleton.INSTANCE;
        System.out.println("s7:"+s7);
        System.out.println("s8:"+s8);

        //通过反射调用私有构造器，构造多个对象
//        Class<LazySingleton> lazySingletonClass = (Class<LazySingleton>) Class.forName("com.qixingjun.singleton.LazySingleton");
//        Constructor<LazySingleton> lazySingletonConstructor = lazySingletonClass.getDeclaredConstructor(null);
//        lazySingletonConstructor.setAccessible(true);
//        LazySingleton lazySingleton1 =lazySingletonConstructor.newInstance();
//        LazySingleton lazySingleton2 =lazySingletonConstructor.newInstance();
//        System.out.println("lazySingleton1:"+lazySingleton1);
//        System.out.println("lazySingleton2:"+lazySingleton2);

        //通过反序列化调用私有构造器，构造多个对象
        FileOutputStream fos = new FileOutputStream("G:/USTC/IdeaWorkSpace/designpatterns/lazySingleton.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s3);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("G:/USTC/IdeaWorkSpace/designpatterns/lazySingleton.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        LazySingleton lazySingleton3 = (LazySingleton) ois.readObject();
        System.out.println("lazySingleton3:"+lazySingleton3);
    }
}
