package top.keyto.gof23.prototype;

import java.util.Date;

/**
 * 浅克隆实现
 *
 * @author Keyto
 * Created on 2019/2/15
 */
public class Client1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep mom = new Sheep();
        mom.setBirthday(new Date());
        mom.setName("MOM");

        Sheep dolly = (Sheep) mom.clone();
        dolly.setName("Dolly");

        System.out.println("同一个对象：" + (mom == dolly));
    }
}
