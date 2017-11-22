package lec41_inheritance_challenge;

public class Nissan extends Car {

    public Nissan() {
        super("Nissan", "navy blue", 4976, 1964, 1435, "Altima 2.5 SR", 4, 4);
    }

    public void increaseSpeed(int speed) {
        int maxSpeed = 130;
        int addSpeed = getSpeed() + speed;

        if (addSpeed == 0) {
            stop();
        } else if (addSpeed > 0 && addSpeed <= maxSpeed) {
            changeGear('D');
        } else if (addSpeed < 0){
            System.out.println("Speed not recognized");
        }
        if (addSpeed > 0 && addSpeed < maxSpeed) {
            drive(addSpeed, getDirection());
        }
        else if (addSpeed >= maxSpeed) {
            System.out.println("WARNING: Max speed of 130 reached. Can't go any further ");
        }
    }
}