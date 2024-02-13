import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    public void setUp(){
        car = new Car("Tesla", 4,4,true, "diesel" );
    }

    @Test
    public void canMakeSound(){
        assertThat(car.makeSound()).isEqualTo("Beep");
    }

}
