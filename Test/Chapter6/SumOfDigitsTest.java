package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {
    @Test
    void testSumDigits(){
//        call the method and give it expected argument or return of the method
        int result = SumOfDigits.sumDigits(1234);
//        Assert that  what we are expecting is the same as the actual result
        assertEquals(10, result);
    }

}