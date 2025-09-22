import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void shouldReturnSumOfTwoCommaSeparatedNumbers() {
    StringCalculator calculator = new StringCalculator();
    assertEquals(3, calculator.add("1,2"));
    }
}

