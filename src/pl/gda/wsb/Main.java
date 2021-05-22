package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
    Car car1 = new Car("G3s", 523453, "black", 5000.00, 5.5, 40.00, 23543, 5, 40.00);
    System.out.println(car1.distance());
    car1.drive(700);
    car1.refuel(40.00);
    }
}