package academy.devdojo.maratonajava.javacore.CompassUol.teste;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.book;
public class bookTeste01 {
    public static void main(String[] args){
        book HarryPorter = new book(8);
        book GameOfThrones = new book();

        HarryPorter.increaseNoOfBooks(2);
        HarryPorter.increaseNoOfBooks(4);
        System.out.println(HarryPorter.getNoOfBooks());

        HarryPorter.decreaseNoOfBooks(10);
        System.out.println(HarryPorter.getNoOfBooks());

        System.out.println(HarryPorter.getValor());
        System.out.println(GameOfThrones.getValor());

        int eight = 0x10;
        System.out.println(Byte.SIZE);
    }
}
