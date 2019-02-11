package top.keyto.gof23.singleton;

/**
 * 双重检测锁 单例模式实现 （不推荐）
 *
 * @author Keyto
 * Created on 2019/2/11
 */
public class Singleton3 {
    private static Singleton3 instance;


    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            Singleton3 sc;
            synchronized (Singleton3.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (Singleton3.class) {
                        if (sc == null) {
                            sc = new Singleton3();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }

    private Singleton3() {
    }
}
