import org.junit.Test;
import static org.junit.Assert.*;

public class WorkerTest {

    @Test
    public void calculateWeeklyPay_regularHours() {
        Worker worker = new Worker("W001", "John", "Doe", "Mr.", 1985, 20.0);
        double result = worker.calculateWeeklyPay(40.0);
        assertEquals(800.0, result, 0.01);
    }

    @Test
    public void calculateWeeklyPay_overtimeHours() {
        Worker worker = new Worker("W002", "Jane", "Smith", "Ms.", 1990, 25.0);
        double result = worker.calculateWeeklyPay(50.0);
        assertEquals(1000.0 + 375.0, result, 0.01);
    }


    @Test
    public void displayWeeklyPay_regularHours() {
        Worker worker = new Worker("W003", "Bob", "Johnson", "Dr.", 1980, 18.0);
        String result = worker.displayWeeklyPay(40.0);
        assertEquals("Regular Pay: 720.00 (40 hours at $18.00), Overtime Pay: 0.00 (at $27.00), Total Pay: 720.00", result);
    }

    @Test
    public void displayWeeklyPay_overtimeHours() {
        Worker worker = new Worker("W004", "Sue", "Williams", "Mrs.", 1988, 22.0);
        String result = worker.displayWeeklyPay(50.0);
        assertEquals("Regular Pay: 880.00 (40 hours at $22.00), Overtime Pay: 330.00 (at $33.00), Total Pay: 1210.00", result);
    }

}
