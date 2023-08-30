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
        
    }
}
