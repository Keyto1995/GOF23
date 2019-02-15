package top.keyto.gof23.builder;

/**
 * @author Keyto
 * Created on 2019/2/15
 */
public class Client {
    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new SmartPhoneBuilder();
        PhoneDirector phoneDirector = new SmartPhoneDirector(phoneBuilder);
        Phone phone = phoneDirector.directPhone();

        phone.displayHardware();
    }
}
