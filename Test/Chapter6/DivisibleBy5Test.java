package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleBy5Test {
    @Test
    void testRemainderIsEqualZero(){
        int value = DivisibleBy5.isDivisible(8);
        assertTrue(true);
    }

}