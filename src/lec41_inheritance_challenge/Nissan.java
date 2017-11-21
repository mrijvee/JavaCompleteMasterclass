package lec41_inheritance_challenge;

public class Nissan extends Car {

    public Nissan() {
        super("Nissan", "navy blue", 4976, 1964, 1435, "Altima 2.5 SR", 4,  4);
    }

    public void increaseSpeed(int speed) {
        int maxSpeed = 155;
        int addSpeed = getSpeed() + speed;

        if (addSpeed == 0) {
            stop();
        } else if (addSpeed > 0 && speed < maxSpeed) {
            changeGear('D');
        }
        if (addSpeed > 0) {
            drive(addSpeed, getDirection());
        }
    }
}

