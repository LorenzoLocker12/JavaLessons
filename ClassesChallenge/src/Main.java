public class Main {
    public static void main(String[] args) {
        BankAccount visa = new BankAccount();
        visa.setAccountBalance(2000);
        visa.setAccountNumber(2003304);
        visa.setCustomerName("Lorenzo Locker");
        visa.depositFunds(1000);
        visa.withdrawFunds(300000);
        visa.withdrawFunds(100);
    }
}