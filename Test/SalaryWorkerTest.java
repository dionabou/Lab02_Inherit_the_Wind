import org.junit.Test;
import static org.junit.Assert.*;

public class SalaryWorkerTest {

    @Test
    public void calculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("SW001", "Alice", "Johnson", "Dr.", 1980, 120000.0);
        double result = salaryWorker.calculateWeeklyPay(0.0);
        assertEquals(2307.69, result, 0.01);
    }

    @Test
    public void displayWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("SW002", "Bob", "Smith", "Mr.", 1990, 100000.0);
        String result = salaryWorker.displayWeeklyPay(0.0);
        assertEquals("Weekly Pay: 1923.08 (a fraction of the yearly salary)", result);
    }
}
