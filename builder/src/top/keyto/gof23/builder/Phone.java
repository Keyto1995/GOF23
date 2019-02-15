package top.keyto.gof23.builder;

/**
 * @author Keyto
 * Created on 2019/2/15
 */
public class Phone {
    private Screen screen;
    private Cpu cpu;
    private Battery battery;

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void displayHardware() {
        System.out.println(this.screen.getName() + "\n" + this.cpu.getName() + "\n" + this.battery.getName());
    }
}

class Screen {
    private String name;

    public Screen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cpu {
    private String name;

    public Cpu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Battery {
    private String name;

    public Battery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
