package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class MotoBike {
    private String nome;
    private int speed;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed(int howMuch){
        this.speed += howMuch;
    }
    public void decreaseSpeed(int howMuch){
        if(howMuch > this.speed){
            System.out.println("Impossible to down this speed");
            return;
        }
        this.speed -= howMuch;
    }
    public static void MaxSpeed(int maxSpead){
        if(maxSpead < 0){
            System.out.println("Speed value incorret, please put a positive value for speed");
            return;
        }
        System.out.println("max speed is "+maxSpead);
    }

    public void start(){
        System.out.println("Bike Started");
    }
}
