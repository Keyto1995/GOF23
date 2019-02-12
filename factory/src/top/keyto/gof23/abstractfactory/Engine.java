package top.keyto.gof23.abstractfactory;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public interface Engine {
    void run();

    void start();
}

class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("马力足！");
    }

    @Override
    public void start() {
        System.out.println("自动启停！");
    }
}

class LowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("马力弱！");
    }

    @Override
    public void start() {
        System.out.println("启动慢！");
    }
}
