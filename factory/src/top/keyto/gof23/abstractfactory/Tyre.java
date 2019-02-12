package top.keyto.gof23.abstractfactory;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("磨损慢！");
    }
}

class LowTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("磨损快！");
    }
}
