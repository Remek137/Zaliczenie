package pl.gda.wsb;

public class Truck extends Vehicle implements Czynnosci{
    int load;

    public Truck(String registrationNumber, int VIN, String color, Double price, Double fuelBurn, Double gasTankState, int mileage, int load) {
        super(registrationNumber, VIN, color, price, fuelBurn, gasTankState, mileage);
        this.load = load;
    }

    public void drive(){
        System.out.println("Pojechano");
    }

    public void refuel(){
        System.out.println("Pojechano");
    }

    public void distance(){
        if(this.gasTankState > this.fuelBurn){
            System.out.println("Ta ciężarówka przejedzie: " + (gasTankState*100.00)/fuelBurn + "km");
        }
    }
}
