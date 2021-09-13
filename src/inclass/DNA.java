package inclass;

import java.util.HashMap;

public class DNA {

    public static void main(String[] args) {
        System.out.println(countNucleotides("AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"));
    }

    public static String countNucleotides(String dna) {
        HashMap<Character, Integer> nucleotidesCount = new HashMap();
        char[] nucleotides = new char[]{'A', 'C', 'T', 'G'};
        for (char n : nucleotides) {
            nucleotidesCount.put(n, 0);
        }
        for (int i = 0; i < dna.length(); i++) {
            nucleotidesCount.put(dna.charAt(i), nucleotidesCount.get(dna.charAt(i)) + 1);
        }
        return "" + nucleotidesCount.get('A')
                + " " + nucleotidesCount.get('C')
                + " " + nucleotidesCount.get('G')
                + " " + nucleotidesCount.get('T');
    }
}
