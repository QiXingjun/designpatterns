package com.qixingjun.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 享元工厂类
 */
public class ChessFlyWeightFactory {
    //享元池
    private static Map<String,ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChessFlyWeight(String color){
        if (map.get(color)!=null){
            return map.get(color);
        }else {
            ChessFlyWeight chessFlyWeight = new ConcreteChess(color);
            map.put(color,chessFlyWeight);
            return chessFlyWeight;
        }
    }
}
