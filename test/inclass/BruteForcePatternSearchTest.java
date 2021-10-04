package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BruteForcePatternSearchTest {

    @Test
    void findsEasyMatch() {
        assertEquals(3, BruteForcePatternSearch.patternSearch("abracdabra", "ac"));
    }

    @Test
    void findsHardMatch() {
        String p = "woodchuck";
        String t = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?";
        assertEquals(22, BruteForcePatternSearch.patternSearch(t, p));
    }
}