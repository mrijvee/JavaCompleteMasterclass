package lec32_forloop;

public class ForStatement {

    public static void main(String[] args) {
        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window
        for (int i = 2; i <= 8; i++) {
            System.out.println("Interest rate at " + i + "% off $10000 is: " + calculateInterest(10000, i));
        }
        System.out.println();
        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        for (int i = 8; i >= 2; i--) {
            System.out.println("Interest rate at " + i + "% off $10000 is: " + calculateInterest(10000, i));
        }

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers fund
        // if that count is 3 exit the for loop
        // hint: Use the break; statement to exit
        int count = 0;
        for(int i = 0; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
            }
            if (count == 3) {
                break;
            }
        }
    }


    private static double calculateInterest(double amount, double interestRate) {
        return amount*(interestRate/100);
    }

    private static boolean isPrime(int num) {
        if(num == 1 || num == 0) {
            return false;
        }
        for (int i = 2; i <= num/2; i++ ) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}