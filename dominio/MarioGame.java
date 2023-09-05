package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class MarioGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Down");
    }

    @Override
    public void lef() {
        System.out.println("go left");
    }
    @Override
    public void right(){
        System.out.println("Go right");
    }
}
