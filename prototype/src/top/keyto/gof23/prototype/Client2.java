package top.keyto.gof23.prototype;

import java.io.*;
import java.util.Date;

/**
 * 深克隆 （使用序列化和反序列化实现）
 * 对象的所有属性都要实现Serializable接口，不然使用transient忽略序列化。
 *
 * @author Keyto
 * Created on 2019/2/15
 */
public class Client2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Sheep mom = new Sheep();
        mom.setBirthday(new Date(812312321331L));
        mom.setName("MOM");

        System.out.println(mom.getName());
        System.out.println(mom.getBirthday());

        Sheep dolly = (Sheep) deepClone(mom);
        dolly.setName("Dolly");

        dolly.getBirthday().setTime(862312321331L);

        System.out.println("同一个对象：" + (mom == dolly));
        System.out.println(mom.getName());
        System.out.println(mom.getBirthday());
        System.out.println(dolly.getName());
        System.out.println(dolly.getBirthday());
    }

    private static Object deepClone(Object object) throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(object);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
