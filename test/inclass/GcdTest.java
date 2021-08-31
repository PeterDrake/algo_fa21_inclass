package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GcdTest {

    @Test
    void findsSmallGcd() {
        assertEquals(6, Gcd.gcd(12, 30));
    }

    @Test
    void findsLargeGcd() {
        assertEquals(3607, Gcd.gcd(130140560, 123456789));
    }
}