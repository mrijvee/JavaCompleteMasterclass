package lec39_inheritance_part1;

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

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //calling the constructor of the class Animal
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
}
