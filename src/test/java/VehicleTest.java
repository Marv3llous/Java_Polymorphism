import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Vehicle vehicle;



@Test
    public void canMakeSound(){
        assertThat(vehicle.makeSound()).isEqualTo("GRRRRR");
}

@Test
    public void canLandTravel(){
        assertThat(vehicle.landTravel()).isEqualTo(true);
}

}
