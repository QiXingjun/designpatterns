package com.qixingjun.flyweight;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description ConcreteFlyWeight  存储内部状态
 */
public class ConcreteChess implements ChessFlyWeight {

    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置："+coordinate.getX()+"  " +coordinate.getY());
    }
}
