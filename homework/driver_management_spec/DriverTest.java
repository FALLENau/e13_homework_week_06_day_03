import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {

  Driver driver;
  DodgemCar dodgemCar;

  @Before
  public void before() {
    dodgemCar = new DodgemCar("Crash Bandicoot", 10);
    driver = new Driver("Rod", dodgemCar);
  }

  @Test
  public void hasName() {
    assertEquals("Rod", driver.getName());
  }

  @Test
  public void canDriveVehicle(){
    assertEquals("Vroom, smash, Vroom Vroom, smash", driver.driveVehicle());
  }

  @Test
  public void vehicleTakesTime() {
    assertEquals(120, dodgemCar.driveDistance(20));
  }

  @Test
  public void driveHasVehicleDriveDistance() {
      assertEquals(120, driver.driveDistance(20));
  }

}
