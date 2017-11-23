package lec45_composition_challenge;

public class Bed {

    private String type;
    private int mattresses;
    private int sheets;
    private int pillows;

    public Bed(String type, int mattresses, int sheets, int pillows) {
        this.type = type;
        this.mattresses = mattresses;
        this.sheets = sheets;
        this.pillows = pillows;
    }

    public void bedComponents() {
        System.out.println("This room has a " + type + " bed with " + mattresses + " mattresses, " + sheets + " sheets, and " + pillows + " pillows.");
    }
}
