package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import academy.devdojo.maratonajava.javacore.CompassUol.dominio.Rectange;

public class RectangeRunner {
    public static void main(String[] args){
        Rectange rectange = new Rectange(3,5);
        System.out.println("Area: "+rectange.area());
        System.out.println("Perimeter: "+rectange.perimeter());
        System.out.println(rectange);
    }
}
