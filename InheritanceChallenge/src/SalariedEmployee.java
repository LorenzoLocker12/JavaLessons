public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String dateOfBirth, String hireDate,
                            double annualSalary){
        super(name, dateOfBirth, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){

        terminate("12/12/2030");
        isRetired = true;

    }


    @Override
    public double collectPay() {
        double payckeck = (int) annualSalary / 26;
        double adjustedPay = isRetired ? 0.9 * payckeck :payckeck;

        return adjustedPay;

    }

}
