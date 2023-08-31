package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class BiNumber {
    private int num1;
    private int num2;

    public BiNumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public float add(){
        return this.num1 + this.num2;
    }
    public float multiply(){
        return this.num1 * this.num2;
    }

    public void doubleValue(){
        this.num1 *= 2;
        this.num2 *= 2;
    }
    public float getNumber1(){
        return this.num1;
    }
    public float getNumber2(){
        return  this.num2;
    }
}
