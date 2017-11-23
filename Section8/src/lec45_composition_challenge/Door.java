package lec45_composition_challenge;

import java.util.Scanner;

public class Door {

    private double height;
    private double width;

    public Door(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void openCloseDoor() {
        String open = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to open the door or keep it closed?");
        open = scanner.nextLine();
        if (open.equalsIgnoreCase("open")) {
            System.out.println("The door is now opened!!!");
        }
        else {
            System.out.println("The door will remain closed as you wish...");
        }
    }
}
