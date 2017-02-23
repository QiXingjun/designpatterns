package com.qixingjun.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/22
 * @Description 懒汉模式
 */
public class LazySingleton implements Serializable{
    //1.将构造方法私有化，不允许外部直接创建对象
    private LazySingleton(){
        //通过这一步可以防止通过反射来得到LazySingleton
        if (instance!=null){
            throw new RuntimeException();
        }
    }

    //2.创建类的唯一实例,使用private static修饰
    private static LazySingleton instance;

    //3.提供一个获取实例的方法，使用public static修饰
    public static synchronized LazySingleton getInstance(){
        if (instance==null){
           instance = new LazySingleton();
        }
        return instance;
    }

    //反序列化的时候，直接调用此方法,防止通过序列化和反序列化得到不同的对象返回
    public Object readResolve() throws ObjectStreamException{
        return instance;
    }
}
