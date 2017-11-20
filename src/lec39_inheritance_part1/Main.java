package lec39_inheritance_part1;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Chihuahua", 6, 4, 2, 4, 1, 42, "smooth and long" );

        dog.eat();
    }
}
