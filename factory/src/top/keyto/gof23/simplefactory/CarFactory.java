package top.keyto.gof23.simplefactory;

/**
 * @author Keyto
 * Created on 2019/2/12
 */
public class CarFactory {
    public static Car createCar(String type){
        if("奥迪".equals(type)){
            return new AudiCar();
        }else if("比亚迪".equals(type)){
            return new BydCar();
        }else{
            return null;
        }
    }

}
