package academy.devdojo.maratonajava.javacore.CompassUol.exeception_handling.runner;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount other) throws CurrenciesDoNotMatchException {
        if (!this.currency.equals(other.currency)) {
         //   throw new Exception("Currencies don't match " + this.currency + " & " + other.currency);
            throw new CurrenciesDoNotMatchException("Currencies don't match " + this.currency + " & " + other.currency);
        }
        this.amount = this.amount + other.amount;
    }

    public String toString() {
        return amount + " " + currency;
    }
}

class CurrenciesDoNotMatchException extends Exception{
    public CurrenciesDoNotMatchException(String msg){
        super(msg);
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) throws CurrenciesDoNotMatchException {
        Amount amount1 = new Amount("USD2", 10);
        Amount amount2 = new Amount("USD", 20);

        amount1.add(amount2);
        System.out.println(amount1);
    }
}
