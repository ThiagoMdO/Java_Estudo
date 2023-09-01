package academy.devdojo.maratonajava.javacore.CompassUol.teste;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.WhileNumberPlayer;
public class WhileNumberPlayerRunner {
    public static void main(String[] args) {
        WhileNumberPlayer player = new WhileNumberPlayer(47);

        player.printSquaresUPtoLimit();
        System.out.println("");
        player.printCubesUptoLimit();


    }
}
