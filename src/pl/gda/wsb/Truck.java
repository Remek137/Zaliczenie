package pl.gda.wsb;

public class Truck extends Vehicle implements Czynnosci{
    int ladownosc;

    public void jedz(){
        System.out.println("Pojechano");
    }

    public void tankuj(){
        System.out.println("Pojechano");
    }
}
