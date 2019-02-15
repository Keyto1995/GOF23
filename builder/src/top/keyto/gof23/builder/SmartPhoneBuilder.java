package top.keyto.gof23.builder;

/**
 * @author Keyto
 * Created on 2019/2/15
 */
public class SmartPhoneBuilder implements PhoneBuilder {
    @Override
    public Screen buildScreen() {
        System.out.println("构造智能机屏幕");
        return new Screen("5.2寸康宁大猩猩屏幕");
    }

    @Override
    public Cpu buildCpu() {
        System.out.println("构造智能机处理器");
        return new Cpu("高通骁龙840处理器");
    }

    @Override
    public Battery buildBattery() {
        System.out.println("构造智能机电池");
        return new Battery("聚合物锂电池");
    }
}
