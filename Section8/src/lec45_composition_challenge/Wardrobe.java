package lec45_composition_challenge;

public class Wardrobe {

    private int height;
    private int depth;
    private int width;

    public Wardrobe(int height, int depth, int width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    public void getSize() {
        System.out.println("The height of the wardrobe is: " + height + " ft., the depth is " + depth + "ft. and the width is " + width + " ft.");
    }
}
