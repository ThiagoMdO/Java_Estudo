package academy.devdojo.maratonajava.javacore.CompassUol.dominio;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.Address;
public class Customer {
    //state
    private String name;
    private Address homeAddress;
    private Address workAddress;

    //creating
    public Customer(String name, Address homeAddress){
        this.name = name;
        this.homeAddress = homeAddress;
    }

    //operations

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString(){
        return String.format("name - %s, home address - %s, work address - %s", this.name, this.homeAddress, this.workAddress);
    }
}
