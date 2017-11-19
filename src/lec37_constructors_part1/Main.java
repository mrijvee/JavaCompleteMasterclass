package lec37_constructors_part1;

public class Main {

    public static void main(String[] args) {

        Account account = new Account();
        account.withdrawFunds(100);

        account.depositFunds(40);
        account.withdrawFunds(20);
        account.depositFunds(10);

        Account account1 = new Account("Peter Parker", "peterparker@gmail.com", 3878021845l);
        System.out.println(account1.getPhoneNumber());
    }
}
