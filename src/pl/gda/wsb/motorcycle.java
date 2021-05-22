package pl.gda.wsb;

public class motorcycle extends Vehicle implements Czynnosci{


    public motorcycle(String registrationNumber, int VIN, String color, Double price, Double fuelBurn, Double gasTankState, int mileage) {
        super(registrationNumber, VIN, color, price, fuelBurn, gasTankState, mileage);
    }

    public void drive(){
        System.out.println("Pojechano");
    }

    public void refuel(){
        System.out.println("Pojechano");
    }

    public void distance(){
        if(this.gasTankState > this.fuelBurn){
            System.out.println("Ten motocykl przejedzie: " + (gasTankState*100.00)/fuelBurn + "km");
        }
    }
}
