package com.qixingjun.observer;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/26
 * @Description
 */
public class SubObserver implements Observer {

    private int myState;    //myState的值需要跟目标对象的state值保持一致

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
