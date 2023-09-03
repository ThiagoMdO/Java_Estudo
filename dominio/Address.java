package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class Address {
    private String line1;
    private String city;
    private String zip;

    //creating
    public Address(String line1, String city, String zip) {
        super();
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return this.line1 + " " + this.city + " " + this.zip;
    }
}
