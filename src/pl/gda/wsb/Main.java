package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
    Car car1 = new Car("GST 24612", 523453345, "black", 5000.00, 5.5, 40.00, 23543, 5, 40.00);
    Car car2 = new Car("GA 24365", 56234452, "white", 15000.00, 8.0, 25.00, 426524, 3, 45.00);

    Truck truck1 = new Truck("GA 24GS5", 56874452, "yellow", 15000.00, 15.0, 35.00, 126524, 60.0, 1500);
    Truck truck2 = new Truck("GA 63DS5", 56871452, "brown", 40000.00, 19.0, 50.00, 1216524, 90.0, 3000);

    Motorcycle motorcycle1 = new Motorcycle("GD 245", 56814452, "chrome", 20000.00, 3.0, 25.00, 126824, 25.0);
    Motorcycle motorcycle2 = new Motorcycle("GD 215", 56814352, "dark blue", 30000.00, 4.0, 10.00, 126864, 20.0);

    System.out.println(car1.distance());
    car1.drive(700);
    car1.refuel(40.00);
    car1.paint("blue");
    }
}