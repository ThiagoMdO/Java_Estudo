package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        for (int i = 2; i <= this.number - 1; i++) {
            if (this.number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= this.number; i++) {

            sum = sum + i;
            if (i == 1) {
                System.out.print(sum);
            } else {
                System.out.print(" + " + sum);
            }


        }
        return sum;
    }

    public int sumOfDivisors() {
        int sum = 0;

        for (int i = 2; i < this.number - 1; i++) {
            if (number % i == 0) {
                sum += i;
            }
            return 0;

        }
        return sum;
    }

    public void printNumberTriangle() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }
}
