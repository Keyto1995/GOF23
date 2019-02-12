package top.keyto.gof23.simplefactory;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public class AudiCar implements Car {
    @Override
    public void run() {
        System.out.println("奥迪 跑起来了！");
    }
}
