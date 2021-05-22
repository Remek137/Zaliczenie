package pl.gda.wsb;

public class Car extends Vehicle implements Czynnosci{
    int doorAmount;

    public Car(String registrationNumber, int VIN, String color, Double price, Double fuelBurn, Double gasTankState, int mileage, int doorAmount) {
        super(registrationNumber, VIN, color, price, fuelBurn, gasTankState, mileage);
        this.doorAmount = doorAmount;
    }

    public void drive(int kilometersToGo){
        if(kilometersToGo <= this.distance()) {
            System.out.println("Pojechano: " + kilometersToGo + "km");
            System.out.println(this.mileage);
            this.mileage += this.gasTankState*100.00/this.fuelBurn;
            System.out.println(this.mileage);
            System.out.println(this.gasTankState);
            this.gasTankState -= (kilometersToGo/100)*this.fuelBurn;
            System.out.println(this.gasTankState);
        }
        else System.out.println("Nie można przejechać tyle km, nie starczy paliwa!");
    }

    public void refuel(Double fuelAmount){
        System.out.println("Przed zatankowaniem: " + this.gasTankState);
        this.gasTankState += fuelAmount;
        System.out.println("Zatankowano: " + fuelAmount + " litrów");
        System.out.println("aktualnie bak posiada: " + this.gasTankState + " litrów");
    }

    public Double distance(){
    {
        return (this.gasTankState*100.00)/this.fuelBurn;
    }
    }
}
