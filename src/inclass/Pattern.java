package inclass;

public class Pattern {

    public static int pattern(String word, String code) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == code.charAt(0) && word.charAt(i+1) == code.charAt(1)) return i;
        }
        return 0;
    }
}
