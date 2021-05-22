package pl.gda.wsb;

public abstract class Vehicle {
    String registrationNumber;
    int VIN;
    String color;
    Double price;
    Double fuelBurn;
    Double gasTankState;
    int mileage;

    public Vehicle(String registrationNumber, int VIN, String color, Double price, Double fuelBurn, Double gasTankState, int mileage) {
        this.registrationNumber = registrationNumber;
        this.VIN = VIN;
        this.color = color;
        this.price = price;
        this.fuelBurn = fuelBurn;
        this.gasTankState = gasTankState;
        this.mileage = mileage;
    }
}
