public class HourlyEmployee extends Employee{
    private double hourlySalaryRate;

    public HourlyEmployee(String name, String dateOfBirth, String hireDate, double hourlySalaryRate) {
        super(name, dateOfBirth, hireDate);
        this.hourlySalaryRate = hourlySalaryRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlySalaryRate;
    }

    public double getDoublePay(){
        return collectPay() * 2;
    }
}
