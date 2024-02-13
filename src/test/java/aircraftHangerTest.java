import interfaces.IValue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class aircraftHangerTest {

    aircraftHanger aircraftHanger;

    @BeforeEach
    public void setUp(){
        aircraftHanger = new aircraftHanger();
    }


    @Test
    public void canCountVehicles(){
        assertThat(aircraftHanger.countVehicles()).isEqualTo(0);
    }


    @Test
    public void canAddVehicles(){
        Vehicle vehicle = new Car("Car", 4, 4, true, "diesel");
        aircraftHanger.addVehicle(vehicle);
        assertThat(aircraftHanger.countVehicles()).isEqualTo(1);
    }

    @Test
    public void canPrintObjectClassification() {
        Vehicle vehicle = new Car("toyota", 4, 4, true,"petrol");
        System.out.println(vehicle.objectClassification());
    }


}
