package P05VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle (String type, String model,String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel (){
        return this.model;
    }

    public String getType() {
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void setType (String type) {
        this.type = type;
    }

    public String toString() {
        if (getType().equals("car")) {
            this.type = "Car";
        } else {
            this.type = "Truck";
        }
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", getType(), getModel(), getColor(), getHorsepower());
    }
}
