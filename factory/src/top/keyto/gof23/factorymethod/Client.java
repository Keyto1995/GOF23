package top.keyto.gof23.factorymethod;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public class Client {
    public static void main(String[] args) {
        Car car1 = new AudiCarFactory().createCar();
        Car car2 = new BydCarFactory().createCar();

        car1.run();
        car2.run();
    }
}
