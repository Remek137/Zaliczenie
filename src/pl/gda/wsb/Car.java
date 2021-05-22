package pl.gda.wsb;

public class Car extends Vehicle implements Czynnosci{
    int doorAmount;

    public Car(String registrationNumber, int VIN, String color, Double price, Double fuelBurn, Double gasTankState, int mileage, int doorAmount) {
        super(registrationNumber, VIN, color, price, fuelBurn, gasTankState, mileage);
        this.doorAmount = doorAmount;
    }

    public void drive(){
        System.out.println("Pojechano");
    }

    public void refuel(){
        System.out.println("Pojechano");
    }

    public void distance(){
    if(this.gasTankState > this.fuelBurn){
        System.out.println("Ten samochód przejedzie: " + (gasTankState*100.00)/fuelBurn + "km");
    }
    }
}
