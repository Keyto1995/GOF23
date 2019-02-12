package top.keyto.gof23.simplefactory;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public class CarFactory2 {
    public static Car createAudi() {
        return new AudiCar();
    }

    public static Car createByd() {
        return new BydCar();
    }

}
