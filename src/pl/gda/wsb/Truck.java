package pl.gda.wsb;

public class Truck extends Vehicle implements Czynnosci{
    int load;

    public Truck(String registrationNumber, int VIN, String color, Double price, Double fuelBurn, Double gasTankState, int mileage, int load) {
        super(registrationNumber, VIN, color, price, fuelBurn, gasTankState, mileage);
        this.load = load;
    }

    public void drive(int kilometersToGo){
        System.out.println("Pojechano");
    }

    public void refuel(){
        System.out.println("Pojechano");
    }

    public Double distance(){
        {
            System.out.println("Ten samochód przejedzie: " + (this.gasTankState*100.00)/this.fuelBurn + "km");
            return (this.gasTankState*100.00)/this.fuelBurn;
        }
    }
}
