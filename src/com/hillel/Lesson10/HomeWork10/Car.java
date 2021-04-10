package Lesson10.HomeWork10;

public final class Car extends FreightTransport {

    private String name;
    private String deliveryCosts;

    public void Car(){
    }
    public Car(String typeName) {
        super(typeName);
    }

    public Car(String typeName, String name) {
        super(typeName);
        this.name = name;
    }

    public Car(String typeName, String name, String deliveryCosts) {
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
        return "Car{" +
                "name='" + name + '\'' +
                ", deliveryCosts='" + deliveryCosts + '\'' +
                '}';
    }
    public void specificationCar(){
        System.out.println("Maximum permissible weight 100");
    }
}
