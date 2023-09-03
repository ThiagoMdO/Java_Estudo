package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import academy.devdojo.maratonajava.javacore.CompassUol.dominio.Address;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.Customer;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("Tomba","Feira de Santana","43256523-234");
        Customer customer = new Customer("João", homeAddress);
        Address workAddress = new Address("Mata Escura","Salvador","43253-232");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}
