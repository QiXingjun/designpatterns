package singleton;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/22
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        //饿汉模式
        HungrySingleton s1 = HungrySingleton.getInstance();
        HungrySingleton s2 = HungrySingleton.getInstance();
        if (s1 == s2){
            System.out.println("s1和s2是同一个实例");
        }else{
            System.out.println("s1和s2不是同一个实例");
        }

        //懒汉模式
        LazySingleton s3 = LazySingleton.getInstance();
        LazySingleton s4 = LazySingleton.getInstance();
        if (s3 == s4){
            System.out.println("s3和s4是同一个实例");
        }else{
            System.out.println("s3和s4不是同一个实例");
        }
    }
}
