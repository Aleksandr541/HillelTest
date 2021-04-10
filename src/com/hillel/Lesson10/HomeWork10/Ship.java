package Lesson10.HomeWork10;

public final class Ship extends FreightTransport {

    private String name;
    private String deliveryCosts;

    public void Ship(){}

    public Ship(String typeName) {
        super(typeName);
    }

    public Ship(String typeName, String name) {
        super(typeName);
        this.name = name;
    }

    public Ship(String typeName, String name, String deliveryCosts) {
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
        return "Ship{" +
                "name='" + name + '\'' +
                ", deliveryCosts='" + deliveryCosts + '\'' +
                '}';
    }
    public void specificationShip(){
        System.out.println("Maximum permissible weight 15000");
    }

}
