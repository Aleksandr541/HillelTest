package Lesson10.HomeWork10;

public abstract class FreightTransport extends Transport{

    private String typeName;

    private String speedDelivery;


    public FreightTransport() {
    }

    public FreightTransport(String typeName) {
        this.typeName = typeName;
    }

    public void whatTransport(){
    System.out.println("Грузовой транспорт:  "+ typeName);
}

}
