package lec45_composition_challenge;

public class Closet {

    private int depth;
    private int width;

    public Closet(int depth, int width) {
        this.depth = depth;
        this.width = width;
    }

    public void getSize() {
        System.out.println("The depth of the built-in closet is: " + depth + " ft. and the width is " + width + " ft.");
    }
}
