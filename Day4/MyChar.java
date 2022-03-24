package Day4;

public class MyChar {


    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if (ch == 'a')
            return true;
        if (ch == 'e')
            return true;
        if (ch == 'i')
            return true;
        if (ch == 'o')
            return true;
        if (ch == 'u')
            return true;
        if (ch == 'A')
            return true;
        if (ch == 'E')
            return true;
        if (ch == 'I')
            return true;
        if (ch == 'O')
            return true;
        if (ch == 'U')
            return true;

        return false;
    }

    public boolean isNumber() {
        if (ch >= 48 && ch <= 57)
            return true;

        return false;
    }

    public boolean isAlphabets() {
        if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 92)
            return true;

        return false;
    }

    public static void printLowerCaseAlphabets() {
        for (char ch = 97; ch <= 122; ch++) {
            System.out.println(ch);
        }
    }
    public static void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }


    public boolean isConsonant() {
        if(isAlphabets() && !isVowel())
            return true;

        return false;
    }
}
