package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentTest {

    @Test
    void pow() {
        assertEquals(8.0, Exponent.pow(2, 3));
    }
}