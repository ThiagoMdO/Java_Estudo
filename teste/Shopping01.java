package academy.devdojo.maratonajava.javacore.CompassUol.teste;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.ShoppingSystem;
public class Shopping01 {
    public static void main(String[] args){
        ShoppingSystem shoppingSystemTest01 = new ShoppingSystem();
        shoppingSystemTest01.setTipoLoja("Esporte");
        shoppingSystemTest01.setNumeroLoja(44);
        System.out.println(shoppingSystemTest01.getNumeroLoja());
        System.out.println(shoppingSystemTest01.getTipoLoja());


    }


}
