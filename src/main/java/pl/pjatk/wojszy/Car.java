package pl.pjatk.wojszy;

public class Car {

    private String Name;
    private String Model;

    public Car(){
    }

    public Car(String name, String model)
    {
        this.Name = name;
        this.Model = model;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
