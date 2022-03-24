package Day4;

public class MyCharRunner {

    public static void main(String args[]){
        MyChar charac = new MyChar('c');
        System.out.println(charac.isVowel());//a,e,i,o,u
        System.out.println(charac.isNumber());//0 to 9
        System.out.println(charac.isAlphabets());//  a to z, A to Z
        charac.printLowerCaseAlphabets();//a to z
        charac.printUpperCaseAlphabets();// A to Z
        System.out.println(charac.isConsonant());//alphabets except vowel
    }
}
