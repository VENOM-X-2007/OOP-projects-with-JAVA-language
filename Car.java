

public class Car {
    public String name;
    public int maxSpeed;
    public float price;
    public int model;

    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }

    public void setModel(int m){
        if (m>=2016) {
            model=m;
        }
        else
            System.out.println("Sorry, we don't accept this model");
    }
    public int getModel(){
        return model;
    }
}
