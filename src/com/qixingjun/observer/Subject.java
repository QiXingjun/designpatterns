package com.qixingjun.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description
 */
public class Subject {
    private List<Observer> list = new ArrayList<>();

    public void registerObserver(Observer observer){
        list.add(observer);
    }

    public void deleteObserver(Observer observer){
        list.remove(observer);
    }

    //通知所有的观察者更新状态
    public void notifyAllObservers(){
        for (Observer obs:list) {
            obs.update(this);
        }
    }
}
