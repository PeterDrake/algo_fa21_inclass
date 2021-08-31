package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

    @Test
    void adds2And3() {
        assertEquals(5, Adder.add(2, 3));
    }

    @Test
    void adds3AndMinus8() {
        assertEquals(-5, Adder.add(3, -8));
    }
}