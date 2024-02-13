import interfaces.IValue;

public abstract class Vehicle implements IValue {

    private String name;
    private int numberOfOccupants;
    private int numberOfWheels;

    private boolean canLandTravel;

    public Vehicle(String name, int numberOfOccupants, int numberOfWheels, boolean canLandTravel){
        this.name = name;
        this.numberOfOccupants = numberOfOccupants;
        this.numberOfWheels = numberOfWheels;
        this.canLandTravel = canLandTravel;

    }

public String makeSound(){
        return "GRRRRR";
}

public boolean landTravel(){
        return true;
}

public String calculateValue(int value){
        return this.name + " has a value of "  + value;
}

abstract String objectClassification();

}

