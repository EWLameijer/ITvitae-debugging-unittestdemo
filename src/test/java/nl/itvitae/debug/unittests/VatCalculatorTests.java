package nl.itvitae.debug.unittests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VatCalculatorTests {

    @Test
    @DisplayName("121 euros excluding VAT should be 100 euros")
    void checksVat() {
        VatCalculator calculator = new VatCalculator();
        assertEquals(100, calculator.excludingVat(121),
                "121 euros excluding VAT should be 100 euros");
    }
}
