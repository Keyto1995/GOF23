package top.keyto.gof23.simplefactory;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public class BydCar implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪 跑起来了！");
    }
}
