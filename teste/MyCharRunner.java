package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import academy.devdojo.maratonajava.javacore.CompassUol.dominio.MyChar;

public class MyCharRunner {
    public static void main(String[] args){
        MyChar myChar = new MyChar('a');
        System.out.println(myChar.isVowel());
        char alf = (int)65;
        char alf2 = (int)122;
        System.out.println(alf);
        System.out.println(alf2);
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isConsonant());
        MyChar.printLowerCaseAlphabet();
        System.out.println("\n");
        MyChar.printUperCaseAlphabet();
    }
}
