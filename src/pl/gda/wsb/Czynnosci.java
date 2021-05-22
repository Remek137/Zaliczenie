package pl.gda.wsb;

public interface Czynnosci {

    public void drive(int kilometersToGo);

    public void refuel(Double fuelAmount);

    public Double distance();
}
