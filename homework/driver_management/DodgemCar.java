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

  public int driveDistance(int distance) {
    int time = distance/this.speed*60;
    return time;
}

  public String driveVehicle() {
    return "Vroom, smash, Vroom Vroom, smash";
  }
}
