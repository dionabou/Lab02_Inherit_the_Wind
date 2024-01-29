public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regularPay = Math.min(hoursWorked, 40) * hourlyPayRate;
        double overtimePay = Math.max(hoursWorked - 40, 0) * 1.5 * hourlyPayRate;
        return regularPay + overtimePay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularPay = Math.min(hoursWorked, 40) * hourlyPayRate;
        double overtimePay = Math.max(hoursWorked - 40, 0) * 1.5 * hourlyPayRate;
        double totalPay = regularPay + overtimePay;

        return String.format("Regular Pay: %.2f (40 hours at $%.2f), Overtime Pay: %.2f (at $%.2f), Total Pay: %.2f",
                regularPay, hourlyPayRate, overtimePay, 1.5 * hourlyPayRate, totalPay);
    }
}
