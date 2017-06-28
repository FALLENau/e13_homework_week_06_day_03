package driver_management;
import behaviours.*;

public class DodgemCar extends Vehicle implements Driveable {

  int speed;

  public DodgemCar(String name, int speed) {
    super(name);
    this.speed = speed;
  }

  public int getSpeed() {
    return this.speed;
  }

  public String DriveVehicle() {
    return "Turning the key Vroom, put the foot down, VROOOOOM!";
  }
}
