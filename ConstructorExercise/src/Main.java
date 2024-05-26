public class Main {
    public static void main(String[] args) {

        Customer jeff = new Customer();
        System.out.println(jeff.getCustomerEmail());
        System.out.println(jeff.getCustomerName());
        System.out.println(jeff.getCustomerCreditLimit());

        Customer bryan = new Customer("Bryan", "bryanBoy@gmail.com");
        System.out.println(bryan.getCustomerName());
        System.out.println(bryan.getCustomerEmail());
        System.out.println(bryan.getCustomerCreditLimit());

        Customer chris = new Customer("Chris", 200.00, "ChrisBoy@gmail.com");
        System.out.println(chris.getCustomerName());
        System.out.println(chris.getCustomerEmail());
        System.out.println(chris.getCustomerCreditLimit());
    }
}