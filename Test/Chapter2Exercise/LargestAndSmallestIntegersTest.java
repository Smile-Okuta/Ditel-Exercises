package Chapter2Exercise;

import Chapter2.LargestAndSmallestIntegers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestAndSmallestIntegersTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testForLargeNumber(){
//        Create an instance of the class to access the method in it
        LargestAndSmallestIntegers largestAndSmallestIntegers = new LargestAndSmallestIntegers();
//        Determine the parameter of the method and the return type
        int largest = largestAndSmallestIntegers.largest(4,5,3,2,2);
//        Your expected result from the method
        int largeNumber = 5;
//        Your expected result and the method's result
        assertEquals(largeNumber, largest);
    }
    @Test
    void testForSmallNumber(){
        LargestAndSmallestIntegers largestAndSmallestIntegers = new LargestAndSmallestIntegers();
        int smallest = largestAndSmallestIntegers.smallest(4,5,3,2,2);
        int smallestNumber = 2;
        assertEquals(smallestNumber, smallest);
    }
}