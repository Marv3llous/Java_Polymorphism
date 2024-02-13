import interfaces.IValue;

import java.util.ArrayList;
import java.util.List;

public class aircraftHanger {

    private ArrayList<Vehicle> vehicles;
    private List<IValue> values;


    public aircraftHanger(){
        this.vehicles = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public int countVehicles(){
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void addValues(IValue value){
        this.values.add(value);
    }

    public List<IValue> getValues(){
        return this.values;
    }

}
