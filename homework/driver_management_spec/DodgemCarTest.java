import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DodgemCarTest {

  DodgemCar dodgemCar;

  @Before
  public void before() {
    dodgemCar = new DodgemCar("Crash Bandicoot dodgemcar", 10);
  }

@Test
public void vehicleHasType() {
  assertEquals("Crash Bandicoot dodgemcar", dodgemCar.getName());
  }
  // @Test
  // public void hasBrand(){
  //   assertEquals("Nimbus", broom.getBrand());
  // }
}
