public class Customer {

    private String customerName;
    private double customerCreditLimit;
    private String customerEmail;

    public Customer(String customerName, double customerCreditLimit, String customerEmail){
        this.customerName = customerName;
        this.customerCreditLimit = customerCreditLimit;
        this.customerEmail = customerEmail;
    }

    public Customer(){
        this("Default name", 0.00, "Default email");
    }

    public Customer(String customerName, String customerEmail){
        this(customerName, 0.00, customerEmail);
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getCustomerCreditLimit(){
        return customerCreditLimit;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }
}
