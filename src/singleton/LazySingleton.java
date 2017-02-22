package singleton;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/22
 * @Description 懒汉模式并不是线程安全的
 */
public class LazySingleton {
    //1.将构造方法私有化，不允许外部直接创建对象
    private LazySingleton(){

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
}
