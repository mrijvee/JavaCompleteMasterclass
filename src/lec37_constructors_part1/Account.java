package lec37_constructors_part1;

public class Account {

    private static int accountNumber;
    private static double balance;
    private static String customerName;
    private static String email;
    private static long phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public static void depositFunds(double depositFunds) {
        balance += depositFunds;
        System.out.println("You've deposited " + depositFunds + ". Your updated balance is " + balance);
    }

    public static void withdrawFunds(double withdrawFunds) {
        if(balance - withdrawFunds <= 0) {
            System.out.println("Your balance is " + balance + ". Unable to withdraw!!! ");
        } else {
            balance -= withdrawFunds;
            System.out.println("Your withdrawal of " + withdrawFunds + " has been processed. " + "Current balance is " + balance);
        }
    }
}
