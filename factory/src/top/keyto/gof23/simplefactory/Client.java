package top.keyto.gof23.simplefactory;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public class Client {
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("奥迪");
        Car car2 = CarFactory.createCar("比亚迪");
        car1.run();
        car2.run();

        CarFactory2.createAudi().run();
        CarFactory2.createByd().run();
    }
}
