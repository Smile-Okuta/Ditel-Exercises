package Chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxPlanTest {
    TaxPlan taxPlan;

    @BeforeEach
    void setUp(){
        taxPlan = new TaxPlan();
    }

    @Test
    void testThatPercentageIsAccurate(){
        taxPlan.expenses();
        assertEquals(1610, (taxPlan.expenses() * 23) / 100);
    }


}