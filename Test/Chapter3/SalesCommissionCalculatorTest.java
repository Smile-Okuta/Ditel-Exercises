package Chapter3;

import Chapter3.SalesCommissionCalculator.SalesCommissionCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionCalculatorTest {
SalesCommissionCalculator commissionCalculator;
    @BeforeEach
    void salesCommissionCalculation() {
        commissionCalculator = new SalesCommissionCalculator(int salary, int grossSales, int sales);
    }

    @Test
    void testThatNinePercentOfTheSalesIsAddedToSalesPersonEarning(){
        assertEquals(180.063, commissionCalculator.profit(2000.7));

        }
}