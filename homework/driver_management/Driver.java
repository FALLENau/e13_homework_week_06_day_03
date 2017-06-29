package driver_management;
import behaviours.*;

public class Driver {
  String name;
  private Driveable vehicle;

  public Driver(String name, Driveable vehicle){
    this.name = name;
    this.vehicle = vehicle;
  }

  public String getName(){
    return this.name;
  }

  public Driveable getRide(){
    return this.vehicle;
  }

  public void setRide(Driveable vehicle){
    this.vehicle = vehicle;
  }

  public String driveVehicle(){
    return this.vehicle.driveVehicle();
  }

  public int driveDistance(int distance) {
    return this.vehicle.driveDistance(distance);
  }

}
