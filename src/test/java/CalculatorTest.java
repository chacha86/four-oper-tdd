import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void t2() {
        Calculator calculator = new Calculator();
        calculator.plus(1, 2);
    }
}
