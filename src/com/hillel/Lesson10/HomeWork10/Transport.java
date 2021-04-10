package Lesson10.HomeWork10;

public abstract class Transport {
    private String nameTransport;
    private String kindOfTransport;

    public Transport() {
    }
    public Transport(String nameTransport) {
        this.nameTransport = nameTransport;
    }



    public abstract void drive();

}
