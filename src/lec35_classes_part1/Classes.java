package lec35_classes_part1;

public class Classes {

    public static void main(String[] args) {
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers fund
        // if that count is 3 exit the for loop
        // hint: Use the break; statement to exit
        int count = 0;
        for (int i = 0; i <= 99; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
        System.out.println("The number of prime numbers found is: " + count);
    }

    private static boolean isPrime(int num) {
        if (num == 0 || num ==1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}