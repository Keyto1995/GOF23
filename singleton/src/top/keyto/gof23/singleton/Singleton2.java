package top.keyto.gof23.singleton;

/**
 * 懒汉式 单例模式实现
 *
 * @author Keyto
 * Created on 2019/2/11
 */
public class Singleton2 {
    private static Singleton2 instance;


    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    private Singleton2() {
    }
}
