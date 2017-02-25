package com.qixingjun.iterator;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description 自定义的迭代器接口
 */
public interface MyIterator {
    void first();   //将游标指向第一个元素
    void next();    //将游标指向下一个元素
    boolean hasNext();  //判断是否存在下一个元素

    boolean isFirst();  //是否是第一个元素
    boolean isLast();   //是否是最后一个元素

    Object getCurrentObj(); //得到当前游标指向的对象
}
