import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {
        // Create workers
        Worker worker1 = new Worker("W001", "John", "Doe", "Mr.", 1985, 20.0);
        Worker worker2 = new Worker("W002", "Jane", "Smith", "Ms.", 1990, 25.0);
        Worker worker3 = new Worker("W003", "Robert", "Johnson", "Dr.", 1982, 22.0);

        // Create salary workers
        SalaryWorker salaryWorker1 = new SalaryWorker("SW001", "Alice", "Johnson", "Prof.", 1988, 120000.0);
        SalaryWorker salaryWorker2 = new SalaryWorker("SW002", "Bob", "Smith", "Mr.", 1992, 100000.0);
        SalaryWorker salaryWorker3 = new SalaryWorker("SW003", "Eve", "Williams", "Dr.", 1980, 150000.0);

        // Add workers to the ArrayList
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        // Simulate 3 weekly pay periods
        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Payroll:");
            System.out.println("========================================================================================================================================");

            for (Worker worker : workers) {
                double regularHours = (week == 2) ? 50.0 : 40.0; // Simulate crunch time in week 2
                double totalPay = worker.calculateWeeklyPay(regularHours);
                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(regularHours) + " (Regular Hours: " + regularHours + ")");
            }

            System.out.println(); // Separate weeks
        }
    }
}
