public class SalaryWorker extends Worker {

    private double annualSalary;

    public SalaryWorker(String id, String firstName, String lastName, String title, int yearOfBirth, double annualSalary) {
        super(id, firstName, lastName, title, yearOfBirth, 0.0); // Assuming hourly rate is not relevant for SalaryWorker
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        return String.format("Weekly Pay: %.2f (a fraction of the yearly salary)", calculateWeeklyPay(hoursWorked));
    }
}
