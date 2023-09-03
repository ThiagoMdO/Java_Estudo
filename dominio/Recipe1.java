package academy.devdojo.maratonajava.javacore.CompassUol.dominio;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.AbstractRecipe;
public class Recipe1 extends AbstractRecipe{
    void getReady(){
        System.out.println("Get the raw marerials");

    };
    void getTheDish(){
        System.out.println("do the dishes");
    };
    void cleanup(){
        System.out.println("Cleanup the utensils");
    };
}
