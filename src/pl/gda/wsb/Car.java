package pl.gda.wsb;

public class Car extends Vehicle implements Czynnosci{
    int liczbaDrzwi;

    public void jedz(){
        System.out.println("Pojechano");
    }

    public void tankuj(){
        System.out.println("Pojechano");
    }
}
