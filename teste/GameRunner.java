package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import academy.devdojo.maratonajava.javacore.CompassUol.dominio.ChessGame;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.GamingConsole;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.MarioGame;

public class GameRunner {
    public static void main(String[] args) {
        GamingConsole[] games = {new MarioGame(), new ChessGame()};

        for(GamingConsole game : games){
            game.down();
        }

        System.out.println("");
        MarioGame game = new MarioGame();
        game.down();

        ChessGame game1 = new ChessGame();
        game1.down();

        //GamingConsole game3 = new MarioGame();
        GamingConsole game3 = new ChessGame();
        game3.down();
    }
}
