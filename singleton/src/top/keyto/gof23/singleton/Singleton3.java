package top.keyto.gof23.singleton;

/**
 * 双重检测锁 单例模式实现 （不推荐）
 *
 * @author Keyto
 * Created on 2019/2/11
 */
public class Singleton3 {
    // volatile 是为了防止指令重排，且在 Java5 之前仍存在缺陷，必须在 JDK5 版本以上使用。
    private volatile static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    private Singleton3() {
    }
}
