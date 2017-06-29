package driver_management;
import behaviours.*;

public class QuadBike extends Vehicle implements Driveable {

  int speed;

  public QuadBike(String name, int speed) {
    super(name);
    this.speed = speed;
  }

  public int getSpeed() {
    return this.speed;
  }

  public int driveDistance(int distance) {
    int time = distance/this.speed*70;
    return time;
}

  public String driveVehicle() {
    return "VroomVroom Vroooom, smash";
  }
}
