package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class MotoBike {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public static void MaxSpeed(int maxSpead){
        System.out.println("max speed is "+maxSpead);
    }

    public void start(){
        System.out.println("Bike Started");
    }
}
