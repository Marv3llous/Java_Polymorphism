public class Airplane extends Vehicle {

    private double maximumAltitude;


    public Airplane(String name, int numberOfOccupants, int numberOfWheels, boolean canLandTravel, double maximumAltitude){
        super(name, numberOfOccupants, numberOfWheels, canLandTravel);
        this.maximumAltitude = maximumAltitude;
    }

    public int maxAlt(){
        return 42000;
    }
    @Override
    public String makeSound(){
        return "Lift off";
    }

    public String objectClassification() {
        System.out.println("Here is your plane");
        return null;
    }
}
