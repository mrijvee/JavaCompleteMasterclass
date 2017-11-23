package lec45_composition_challenge;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via getter and
// then that objects public method as you saw in the previous video
// then at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

public class Main {

    public static void main(String[] args) {

        Wardrobe wardrobe = new Wardrobe(6, 2, 4);
        Bed bed = new Bed("Bunk-bed", 2,4, 6);
        Chair chair = new Chair(2);
        Door door = new Door(7, 4);
        Closet closet = new Closet(5, 8);
        Ceiling ceiling = new Ceiling(9, "grey");

        Room room = new Room("Mez", wardrobe, bed, closet, chair, door, ceiling);
        room.roomSize(15, 15);
        room.roomComponents();
    }
}
