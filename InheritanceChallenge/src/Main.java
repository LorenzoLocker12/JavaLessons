public class Main {
    public static void main(String[] args) {

        SalariedEmployee lorenzo = new SalariedEmployee("Lorenzo", "12/02/2003", "30/06/2024", 120_000);
        lorenzo.retire();
        System.out.println(lorenzo.collectPay());

        HourlyEmployee maria = new HourlyEmployee("maria", "20/04/2000", "03/03/2021", 15);
        System.out.println(maria.collectPay());
        System.out.println(maria);
        System.out.println(maria.getDoublePay());

    }
}