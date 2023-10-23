package Chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorAndCeilTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void TestForFloorValue(){
//        FloorAndCeil floorAndCeil = new FloorAndCeil();
        int flow = FloorAndCeil.myFloor(6.7);
        int floor = 6;
        assertEquals(floor,flow);
    }
}