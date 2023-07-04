package Chapter3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    GasMileage gasMileage;
    @BeforeEach
    void gasMileage() {
        gasMileage = new GasMileage();
    }



@Test
    void testCalculateMilesPerGallon(){
//        gasMileage.setMiles(10);
//        gasMileage.setGallon(5);
        assertEquals(2.0,gasMileage.divide(10, 5));

    }
}