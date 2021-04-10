package Lesson10.HomeWork10;

public final class Refrigerator extends HouseholdAppliances{

    private String name;
    private String productionYear;


    public Refrigerator(){

    }
    public Refrigerator(String typeTechnics, String voltage, String name) {
        super(typeTechnics, voltage);
        this.name = name;
    }
    public Refrigerator(String name, String productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }


    @Override
    public String toString() {
        return "Refrigerator{" +
                "name='" + name + '\'' +
                ", productionYear='" + productionYear + '\'' +
                '}';
    }

}
