package lec37_constructors_part2;

public class Main {

    public static void main(String[] args) {

        ConstructorChallenge account = new ConstructorChallenge();
        System.out.println("Person 0's email address is: " + account.getEmailAddress());

        ConstructorChallenge account1 = new ConstructorChallenge("Itachi", 2000000.00);
        System.out.println("Person 1's name is " + account1.getName());

        ConstructorChallenge account2 = new ConstructorChallenge("Sasuke", 150000.00, "uchiha@yahoo.com");
        System.out.println("Person 2's email address is: " + account2.getEmailAddress());
    }
}
