package top.keyto.gof23.singleton;

/**
 * 静态内部类 单例模式实现
 *
 * @author Keyto
 * Created on 2019/2/11
 */
public class Singleton4 {
    private static class SingletonClassInstance {
        private static final Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonClassInstance.instance;
    }

    private Singleton4() {
    }
}
