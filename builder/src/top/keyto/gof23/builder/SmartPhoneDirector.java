package top.keyto.gof23.builder;

/**
 * @author Keyto
 * Created on 2019/2/15
 */
public class SmartPhoneDirector implements PhoneDirector {
    private PhoneBuilder builder;

    public SmartPhoneDirector(PhoneBuilder builder) {
        this.builder = builder;
    }

    @Override
    public Phone directPhone() {
        final Screen screen = builder.buildScreen();
        final Cpu cpu = builder.buildCpu();
        final Battery battery = builder.buildBattery();

        Phone phone = new Phone();
        phone.setScreen(screen);
        phone.setCpu(cpu);
        phone.setBattery(battery);

        return phone;
    }
}
