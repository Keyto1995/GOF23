package top.keyto.gof23.abstractfactory;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public interface Seat {
    void message();
}

class LuxurySeat implements Seat {
    @Override
    public void message() {
        System.out.println("真皮座椅！");
    }
}

class LowSeat implements Seat {
    @Override
    public void message() {
        System.out.println("人工合成皮座椅！");
    }
}
