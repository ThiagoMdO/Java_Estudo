package academy.devdojo.maratonajava.javacore.CompassUol.exeception_handling.runner;

public class ExceptionHandingRunner {
    public static void main(String[] args) {
        //method1();
        method2();

    }

    private static void method1(){
        String str = null;
        str.length();


        System.out.println("Method 1");
    }

    private static void method2(){
        try{
//            String str = null;
//            str.length();
            int[] numbers = {1,2};
            int number3 = numbers[3];

            System.out.println("Method 2");
        }catch (NullPointerException ex){
            System.out.println("NullPointerException");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception ex){
            System.out.println("Matched Exception");
            ex.printStackTrace();
        }

    }

}
