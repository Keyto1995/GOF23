package top.keyto.gof23.singleton;

/**
 * 饿汉式 单例模式实现
 *
 * @author Keyto
 * Created on 2019/2/11
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();


    public static Singleton1 getInstance() {
        return instance;
    }

    private Singleton1() {
    }
}
