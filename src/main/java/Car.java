public class Car extends Vehicle {

    private String fuelType;

    public Car(String name, int numberOfOccupants, int numberOfWheels, boolean canLandTravel, String fuelType){
        super(name, numberOfOccupants, numberOfWheels, canLandTravel);
        this.fuelType = fuelType;
    }

    @Override
public String makeSound(){
        return "Beep";
}


public String objectClassification(){
    System.out.println("Here is your car");
    return null;
}
}
