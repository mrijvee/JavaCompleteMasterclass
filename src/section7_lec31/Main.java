package section7_lec31;

public class Main {

    public static void main(String[] args) {

        ClassesChallenge account = new ClassesChallenge();
        account.withdrawFunds(100);

        account.depositFunds(40);
        account.withdrawFunds(20);
        account.depositFunds(10);
    }
}
