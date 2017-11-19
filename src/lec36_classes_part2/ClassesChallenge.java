package lec36_classes_part2;

public class ClassesChallenge {

    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.

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
        balance += depositFunds; //This adds whatever is deposited to the balance
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
