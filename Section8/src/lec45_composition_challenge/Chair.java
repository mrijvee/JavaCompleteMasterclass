package lec45_composition_challenge;

public class Chair {

    private int howManyChairs;

    public Chair(int howManyChairs) {
        this.howManyChairs = howManyChairs;
    }

    public int getHowManyChairs() {
        System.out.println("This room has " + howManyChairs + " chairs");
        return howManyChairs;
    }
}
