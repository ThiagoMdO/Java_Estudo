package academy.devdojo.maratonajava.javacore.CompassUol.dominio;
import java.math.BigDecimal;
public class SimpleInterestCalculator {
    BigDecimal pricipal;
    BigDecimal interest;
    public SimpleInterestCalculator(String pricipal, String interest){
        this.pricipal = new BigDecimal(pricipal);
        this.interest = new BigDecimal(interest);
    }
    public BigDecimal calculateTotalValue(int noOfYears){
        //Total Value = pricipal + pricipal * interest * noOfYears
        if(true ^ false){
            System.out.println("3324");
        }
        System.out.println(pricipal.add(pricipal.multiply(interest).multiply(new BigDecimal(noOfYears))));
        return null;
    }
}
