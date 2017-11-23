package lec45_composition_challenge;

public class Ceiling {

    private int height;
    private String color;

    public Ceiling(int height, String color) {
        this.height = height;
        this.color = color;
    }

    public void ceilingComponents() {
        System.out.println("The height of the ceiling is: " + height + " ft.");
        System.out.println("The color of the ceiling is: " + color);
    }
}
