package com.qixingjun.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/27
 * @Description 负责人类，负责管理备忘录对象
 */
public class CareTaker {
    private EmpMemento empMemento;  //这里只添加一个备忘录点，如果需要添加多个备忘录点
//    private Stack<EmpMemento> list = new Stack<>(); //这样就可以添加多个备忘录点
    //如果备忘录很多，可以序列化和持久化到硬盘

    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}
