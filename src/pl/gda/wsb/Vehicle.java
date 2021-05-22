package pl.gda.wsb;

public abstract class Vehicle {
    String registrationNumber;
    int VIN;
    String color;
    Double price;
    Double fuelBurn;
    Double gasTankState;
    Double maxGasTankStateAmount;
    int mileage;

    public Vehicle(String registrationNumber, int VIN, String color, Double price, Double fuelBurn, Double gasTankState, int mileage, Double maxGasTankStateAmount) {
        this.registrationNumber = registrationNumber;
        this.VIN = VIN;
        this.color = color;
        this.price = price;
        this.fuelBurn = fuelBurn;
        this.gasTankState = gasTankState;
        this.mileage = mileage;
        this.maxGasTankStateAmount = maxGasTankStateAmount;
    }
}
