package OOPS;
class Vehicle{
    int wheels;
    int speed;
    int seats;
}
class PowerVehicle extends Vehicle{  //child class of Vehicle
    int engine;

}
class AirCrafts extends  PowerVehicle{ //child class of PowerVehicle
    int rotors;
}


public class inheritance {
    public static void main(String[] args) {
        PowerVehicle SCORPIO = new PowerVehicle();
        SCORPIO.speed = 200;

        AirCrafts B2 = new AirCrafts();
        B2.engine = 7777;


    // java has no Multiple Inheritance
    }
}
