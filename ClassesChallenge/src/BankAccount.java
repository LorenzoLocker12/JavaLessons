public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String CustomerName;
    private String email;
    private String phoneNumber;


    public void depositFunds(double depositAmount){
        accountBalance += depositAmount;
        System.out.printf("Deposit of %,.2f$ made. Your new balance is: %,.2f$\n", depositAmount, accountBalance);
    }

    public void withdrawFunds(double withdrawAmount){
        double temp = accountBalance - withdrawAmount;
        if(temp < 0){
            System.out.printf("You cannot withdraw %,.2f$, because your balance will be less than 0. Actual balance: %,.2f$\n",
                    withdrawAmount, accountBalance);
        }
        else{
            accountBalance = temp;
            System.out.printf("WithDraw of %,.2f$ made. Your new balance is: %,.2f$\n", withdrawAmount, accountBalance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
