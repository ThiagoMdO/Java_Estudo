package academy.devdojo.maratonajava.javacore.CompassUol.teste;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.MotoBike;
public class MotoBikeRunner {
    public static void main(String[] args){
        MotoBike ducati = new MotoBike();
        MotoBike honda = new MotoBike();

        ducati.start();
        ducati.setNome("Ducati");
        System.out.println(ducati.getNome());

        MotoBike.MaxSpeed(33);

        int ducatiSpeed = ducati.getSpeed();
        System.out.println(ducatiSpeed);
        ducatiSpeed += 100;
        System.out.println(ducatiSpeed);
        System.out.println(ducati.getSpeed());

        ducati.setSpeed(ducatiSpeed);
        System.out.println(ducati.getSpeed());

        ducati.increaseSpeed(500);
        System.out.println(ducati.getSpeed());

        ducati.decreaseSpeed(900);
        System.out.println(ducati.getSpeed());

    }
}
