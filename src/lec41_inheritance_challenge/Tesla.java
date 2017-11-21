package lec41_inheritance_challenge;

public class Tesla extends Car {

    public Tesla () {
        super("Tesla", "navy blue", 4976, 1964, 1435, 2, 4);
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

