package lec39_40_inheritance_part1_part2;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Chihuahua", 6, 4, 2, 4, 1, 42, "smooth and long" );

//        dog.eat();
//        dog.walk();
//        dog.run();
        dog.move(5);

        Fish fish = new Fish("Shark", 15, 2000, 7, 2, 9);
        fish.swim(31);
    }
}

