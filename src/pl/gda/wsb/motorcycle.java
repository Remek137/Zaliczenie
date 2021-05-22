package pl.gda.wsb;

public class motorcycle extends Vehicle implements Czynnosci{


    public motorcycle(String registrationNumber, int VIN, String color, Double price, Double fuelBurn, Double gasTankState, int mileage) {
        super(registrationNumber, VIN, color, price, fuelBurn, gasTankState, mileage);
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
