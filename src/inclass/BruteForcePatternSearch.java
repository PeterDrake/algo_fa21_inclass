package inclass;

//given a pattern, where does it appear in a string of text?
public class BruteForcePatternSearch {

    private BruteForcePatternSearch() {};

    /**
     * Determines where or if a pattern is present in a string.
     * @param s string to be searched
     * @param pattern pattern to be sought
     * @return location of first character of the first instance of the pattern within the string, or -1 if the pattern is not present in the string
     */
    public static int patternSearch(String s, String pattern) {
        for (int i = 0; i < s.length() - pattern.length() + 1; i++) {
            if (s.startsWith(pattern, i)) {
                return i;
            }
        }
        return -1;
    }
}
