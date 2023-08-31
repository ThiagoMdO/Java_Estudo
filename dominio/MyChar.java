package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class MyChar {
    private char ch;
    public MyChar(char ch){
        this.ch = ch;
    }

    public boolean isVowel(){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    public void isNumber(){
 //       if(this.ch = );
    }
    public String isAlphabet() {
        if (ch >= (int) 65 && ch <= (int) 122) {
            return "Alphabet";

        }
        return "Não é uma letra";
    }
    public String isConsonant(){
        //check it's a letter
        if(this.ch >= (int)65 && this.ch <= (int)122){
            if(this.ch == (int)65 || this.ch == (int)66 || this.ch == (int)69 || this.ch == (int)73 || this.ch == (int)79 || this.ch == (int)85){
                return "No is a consonant";
            }
            return "It is a consonant";
        }
       return "It's not a letter";
    }

}
