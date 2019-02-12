package top.keyto.gof23.abstractfactory;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory=new LuxuryCarFactory();
        Engine engine=factory.createEngine();
        engine.start();
        engine.run();
        Seat seat = factory.createSeat();
        seat.message();
        Tyre tyre = factory.createTyre();
        tyre.revolve();
    }
}
