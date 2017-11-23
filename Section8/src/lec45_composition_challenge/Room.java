package lec45_composition_challenge;

import java.util.Scanner;

public class Room {

    private String name;
    private Wardrobe wardrobe;
    private Bed bed;
    private Closet closet;
    private Chair chair;
    private Door door;
    private Ceiling ceiling;

    public Room(String name, Wardrobe wardrobe, Bed bed, Closet closet, Chair chair, Door door, Ceiling ceiling) {
        this.name = name;
        this.wardrobe = wardrobe;
        this.bed = bed;
        this.closet = closet;
        this.chair = chair;
        this.door = door;
        this.ceiling = ceiling;
    }

    public void roomSize(int length, int width) {
        System.out.println("The size of this room is " + length + " ft. in length, and " + width + " ft. in width.");
    }

    public void roomComponents() {
        door.openCloseDoor();
        chair.getHowManyChairs();
        closet.getDepth();
        closet.getWidth();
        ceiling.ceilingComponents();
        wardrobe.getSize();
        fixMessyRoom();
    }

    private void fixMessyRoom() {
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your room seems a bit messy. Do you want to clean it?");
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("sure")) {
            System.out.println("Your room is now clean and clear");
        } else {
            System.out.println("Sorry to hear that. We recommend cleaning your bed every morning to keep the mites away");
        }
    }
}
