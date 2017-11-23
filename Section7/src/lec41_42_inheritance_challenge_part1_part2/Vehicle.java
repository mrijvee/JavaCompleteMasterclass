package lec41_42_inheritance_challenge_part1_part2;

public class Vehicle {

    private String type;
    private String name;
    private String color;
    private int length;
    private int width;
    private int height;
    private int speed;
    private int direction;

    public Vehicle (String type, String name, String color, int length, int width, int height) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.speed = 0;
        this.direction = 0;
    }

    public void steer(int direction) {
        System.out.println("Vehicle.steer() called: Vehicle is steering at a " + direction + " degree angle.");
        this.direction = direction;
    }

    public void drive(int speed, int direction) {
        this.speed = speed;
        this.direction = direction;
        System.out.println("Vehicle.drive() called: Vehicle is moving at " + speed + " mph at a " + direction + " degree angle.");
    }

    public void stop() {
        System.out.println("Car is parked ");
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }
}
