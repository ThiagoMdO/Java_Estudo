package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class MyNumber {
    private int number;
    public MyNumber(int number){
        this.number = number;
    }

    public boolean isPrime(){
        for(int i = 2; i <= this.number - 1; i++){
            if(this.number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
