package driver_management;
//Superclass

public abstract class Vehicle{

  String name;


  public Vehicle(String name) {
    this.name = name;
  }

  public String getName(){
    return this.name;
  }
}
