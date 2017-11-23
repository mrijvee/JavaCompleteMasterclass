package lec44_composition;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        //new Resolution is another way of calling the class.
        //So instead of writing Resolution resolution = new Resolution, we can just include new Resolution inside the arguments of

        Motherboard motherboard = new Motherboard("BJ-200", "ASUS", 4, 6, "v2.44");

        PC pc = new PC(theCase, monitor, motherboard);
        pc.powerUp();

    }
}
