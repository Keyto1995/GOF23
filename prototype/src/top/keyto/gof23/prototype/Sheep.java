package top.keyto.gof23.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Keyto
 * Created on 2019/2/15
 */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
