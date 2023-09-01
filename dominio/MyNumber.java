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
    public int sumUptoN(){
        int sum = 0;
        for(int i = 1; i <= this.number; i++){

            sum = sum + i;
            if(i==1){
                System.out.print(sum);
            }else{
                System.out.print(" + "+sum);
            }


        }
        return sum;
    }
}
