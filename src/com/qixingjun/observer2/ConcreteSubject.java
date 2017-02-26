package com.qixingjun.observer2;

import java.util.Observable;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/26
 * @Description  目标对象
 */
public class ConcreteSubject extends Observable {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;     //目标对象的状态发生了改变
        setChanged();       //表示目标对象已经做了更改
        notifyObservers(state);     //通知所有的观察者
    }
}
