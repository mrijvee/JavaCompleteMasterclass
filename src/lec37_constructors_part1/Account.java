package lec37_constructors_part1;

public class Account {

    private static long accountNumber;
    private static double balance;
    private static String customerName;
    private static String email;
    private static long phoneNumber;

    public Account() {
        this(11084298346l, 12.84, "Mary Jane", "maryjane@yahoo.com", 6476281805l);
        System.out.println("Empty constructor callling... ");
    }

    public Account(long accountNumber, double balance, String customerName, String customerEmail, long phoneNumber) {
        System.out.println("2nd constructor calling... ");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String customerEmail, long phoneNumber) {
        this(128532108231l, 0.00, customerName, customerEmail, phoneNumber);
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
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
