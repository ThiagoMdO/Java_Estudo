package academy.devdojo.maratonajava.javacore.CompassUol.exeception_handling.runner;

import java.util.*;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
            int[] numbers = {1,2,4,6,3};
            int number = numbers[2];
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            System.out.println("Before Sacanner Close");
            if(scanner!=null){
                scanner.close();
            }
        }
        System.out.println("Just before closing out main");
    }
}
