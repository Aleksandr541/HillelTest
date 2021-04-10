package Lesson10.HomeWork10;

public abstract class HouseholdAppliances extends Technics {
    private String typeTechnics;
    private String voltage;

    public HouseholdAppliances(){
    }

    public HouseholdAppliances(String typeTechnics) {
        this();
        this.typeTechnics = typeTechnics;
    }

    public HouseholdAppliances(String typeTechnics, String voltage) {
        this();
        this.typeTechnics = typeTechnics;
        this.voltage = voltage;
    }


    @Override
    public String toString() {
        return "HouseholdAppliances{" +
                "typeTechnics='" + typeTechnics + '\'' +
                ", voltage='" + voltage + '\'' +
                '}';
    }

    @Override
    public void myTechnics() {

    }
}
