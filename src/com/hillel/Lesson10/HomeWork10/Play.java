package Lesson10.HomeWork10;

public class Play {
    public static void main(String[] args) {

        Car car = new Car("Truck","Daf","56");
        Ship ship = new Ship("Ship","Naomi","45");
        Airplane airplane = new Airplane("Airplane","Mriya","145");

//        абстрактный метод у Transport
        car.drive();
        ship.drive();
        airplane.drive();

        car.whatTransport();
        ship.whatTransport();
        airplane.whatTransport();

        car.specificationCar();
        ship.specificationShip();
        airplane.specificationAirplane();

        Refrigerator refrigerator = new Refrigerator();

        refrigerator.myTechnics();








    }
}
