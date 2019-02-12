package top.keyto.gof23.factorymethod;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public class AudiCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new AudiCar();
    }
}
