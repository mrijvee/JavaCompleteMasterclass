package lec37_constructors_part2;

// Have 3 fields -- name, credit limit, and email address
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this as setters won't be needed

public class ConstructorChallenge {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public ConstructorChallenge() {
        this("", 1000000.00, "");
        System.out.println("1st constructor calling.... ");
    }

    public ConstructorChallenge(String name, double creditLimit) {
        this(name, creditLimit, "");
        System.out.println("2nd constructor calling... ");
    }

    public ConstructorChallenge(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Third constructor calling... ");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
