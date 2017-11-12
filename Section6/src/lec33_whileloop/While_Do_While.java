package lec33_whileloop;

public class While_Do_While {

    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 20;
        int total = 0;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
            }
            System.out.println("Even number " + number);
            number++;
            total++;
            if (total >= 5) {
                break;
            }
        }
        System.out.println("The total even numbers found is: " + total);

        // Modify the while code above
        // Make it also record the total number of even numbers
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // and even number or not.
    // return true if an even number, otherwise return false;

    private static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
