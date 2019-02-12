package top.keyto.gof23.abstractfactory;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public interface CarFactory {
    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}
