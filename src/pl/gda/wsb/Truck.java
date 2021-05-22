package pl.gda.wsb;

public class Truck extends Vehicle implements Czynnosci{
    int load;

    public Truck(String registrationNumber, int VIN, String color, Double price, Double fuelBurn, Double gasTankState, int mileage, Double maxGasTankStateAmount, int load) {
        super(registrationNumber, VIN, color, price, fuelBurn, gasTankState, mileage, maxGasTankStateAmount);
        this.load = load;
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
        if (this.gasTankState > this.maxGasTankStateAmount)
        {
            System.out.println("Zatankowano do pełna, więcej się nie dało!");
            this.gasTankState = maxGasTankStateAmount;
        }
        System.out.println("Aktualnie bak posiada: " + this.gasTankState + " litrów");
    }

    public Double distance(){
        {
            return (this.gasTankState*100.00)/this.fuelBurn;
        }
    }
}
