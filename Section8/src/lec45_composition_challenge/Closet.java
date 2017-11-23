package lec45_composition_challenge;

public class Closet {

    private int depth;
    private int width;

    public Closet(int depth, int width) {
        this.depth = depth;
        this.width = width;
    }

    public int getDepth() {
        System.out.println("The depth of the built-in closet is: " + depth + " ft.");
        return depth;
    }

    public int getWidth() {
        System.out.println("The width of the built-in closet is: " + width + " ft.");
        return width;
    }
}
