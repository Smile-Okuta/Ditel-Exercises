package Chapter3;

import Chapter3.CreditLimitCalculator.CreditLimitCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {

    CreditLimitCalculator creditLimitCal;

    @BeforeEach
    void creditLimitCalculator() {
        creditLimitCal = new CreditLimitCalculator();
    }
    @Test
    void testForNewBalance(){
//        creditLimit.getBalance();
//        creditLimit.getTotalItems();
//        creditLimit.getTotalCredit();

        assertEquals(3000, creditLimitCal.newBalance(3000, 1000, 1000));
    }

}