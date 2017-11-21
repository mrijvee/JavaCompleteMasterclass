package lec41_inheritance_challenge;

public class Main {

    // Create a base class Vehicle, then create a Car class that inherits from this base class.
    // Finally, create another class, a specific type of Car that inherits from the Car class.
    // You should be able to hand steering, changing gears, and moving (speed in other words).
    // YOu will want to decide where to put the appropirate state and behaviors (fields and methods).
    // As mentioned above, changing gears, increasing/decreasing speed should be included.
    // For the specific type of vehicle, you will want to add something specific for that type of Car

    public static void main(String[] args) {

        Nissan altima = new Nissan();
        altima.increaseSpeed(30);
        altima.increaseSpeed(-10);
    }
}
