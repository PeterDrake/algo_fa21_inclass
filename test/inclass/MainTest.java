package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void twice() {
        Main m = new Main();
        assertEquals(10, m.twice(5));
    }
}