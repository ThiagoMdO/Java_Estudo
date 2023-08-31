package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class book {
    private int noOfBooks;
    public int valor12;
    {
        System.out.println("Objeto instânciado");
    }
    public book(int valor1){
        this.valor12 = valor1;
    }
    public book(){
        //this.valor12 = 12;
        //or
        this(12);
    }

    public int getValor(){
        return this.valor12;
    }
    public void setNoOfBooks(int howMuch){
        this.noOfBooks = howMuch;
    }
    public int getNoOfBooks(){
        return this.noOfBooks;
    }
    public void increaseNoOfBooks(int howMuch){
        setNoOfBooks(this.noOfBooks + howMuch);
    }
    public void decreaseNoOfBooks(int howMuch){
        if(howMuch > this.noOfBooks){
            System.out.println("invaluable numbers of books");
            return;
        }
        this.noOfBooks -= howMuch;
    }
}
