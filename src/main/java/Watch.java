import interfaces.IValue;

public class Watch implements IValue {

    private String name;
    private int numberOfOwners;


    public Watch(String name, int numberOfOwners){
        this.name = name;
        this.numberOfOwners = numberOfOwners;
    }

    public String calculateValue(int value){
        return this.name + " has a value of " + value;
    }

    public void objectClassification() {
        System.out.println("Here is your watch");
    }
}
