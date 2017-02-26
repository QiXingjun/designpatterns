package com.qixingjun.observer;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/26
 * @Description
 */
public class ConcreteSubject extends Subject {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //主题对象的值发生了变化，请通知所有的观察者
        this.notifyAllObservers();
    }
}
