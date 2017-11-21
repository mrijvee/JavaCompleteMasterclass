package lec41_inheritance_challenge;

public class Car extends Vehicle {

    private String model;
    private int wheels;
    private int doors;
    private char gears;

    public Car(String name, String color, int length, int width, int height, String model, int wheels, int doors) {
        super("Mid-size sedan ", name, color, length, width, height);
        this.model = model;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = 'P';
    }

    public void changeGear(char gears) {
        this.gears = gears;
        System.out.println("Car.changeGear() called: Car has been shifted to gear " + this.gears);
    }

    public void drive(int speed, int direction) {
        super.drive(speed, direction);
        System.out.println("Car.move() called: Car is moving at " + speed + " mph at " + direction + " angle.");
    }
}
