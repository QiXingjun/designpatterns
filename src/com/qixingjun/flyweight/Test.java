package com.qixingjun.flyweight;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChessFlyWeight("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChessFlyWeight("黑色");
        ChessFlyWeight chess3 = ChessFlyWeightFactory.getChessFlyWeight("白色");
        System.out.println(chess1);
        System.out.println(chess2);
        System.out.println(chess3);

        System.out.println("增加外部状态的处理。。。。。。。");
        chess1.display(new Coordinate(10,20));
        chess2.display(new Coordinate(100,200));
        chess3.display(new Coordinate(1000,2000));
    }
}
