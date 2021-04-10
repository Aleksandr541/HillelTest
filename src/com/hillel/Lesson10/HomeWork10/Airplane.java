package Lesson10.HomeWork10;

public final class Airplane extends FreightTransport {
    private String name;
    private String deliveryCosts;

    public Airplane() {
    }


    public Airplane(String typeName) {
        super(typeName);
    }

    public Airplane(String typeName, String name) {
        super(typeName);
        this.name = name;
    }

    public Airplane(String typeName, String name, String deliveryCosts) {
        super(typeName);
        this.name = name;
        this.deliveryCosts = deliveryCosts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryCosts() {
        return deliveryCosts;
    }

    public void setDeliveryCosts(String deliveryCosts) {
        this.deliveryCosts = deliveryCosts;
    }

    @Override
    public void drive() {

    }

    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                ", deliveryCosts='" + deliveryCosts + '\'' +
                '}';
    }
    public void specificationAirplane(){
        System.out.println("Maximum permissible weight 20");
    }


}
