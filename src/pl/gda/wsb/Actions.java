package pl.gda.wsb;

public interface Actions {

    public void drive(int kilometersToGo);

    public void refuel(Double fuelAmount);

    public Double distance();

    public void paint(String color);
}
