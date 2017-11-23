package lec39_40_inheritance_part1_part2;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    private void chew() {
        System.out.println("dog.chew() called ");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called ");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("dog.walk() called ");
        super.move(3);
    }

    public void run() {
        System.out.println("dog.run() called ");
        super.move(6);
    }

    private void moveLegs(int speed) {
        System.out.println("dog.moveLegs() called ");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move() called ");
        moveLegs(5);
        super.move(speed);
    }

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //calling the constructor of the class Animal
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
}
