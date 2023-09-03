package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import academy.devdojo.maratonajava.javacore.CompassUol.dominio.Fan;

public class FanRunner {



    public static void main(String[] args) {
        Fan fan = new Fan("Modial",30,"Red");
        System.out.println(fan);
        fan.isOn(true);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte) 5);
        System.out.println(fan);

    }
}
