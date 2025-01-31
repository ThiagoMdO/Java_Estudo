package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class WhileNumberPlayer {
    private int limit;

    public WhileNumberPlayer(int limit) {
        this.limit = limit;
    }

    //For limit == 30, output would be 1 4 9 16 25
    public void printSquaresUPtoLimit() {
        int i = 1;
        while (i * i < this.limit) {
            System.out.println(i * i);
            i++;
        }
    }

    //For limit = 30, output would be 1 8 27
    public void printCubesUptoLimit() {
        int i = 1;
        while(i * i * i < this.limit){
            System.out.println(i*i*i);
            i++;
        }
    }
}
