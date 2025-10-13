Method OverRiding:

       If parent and child have same method signature (same access modifier, same return type , and same method name) but difference in their implementation.


Vehicle class:

package Method_OverRiding;

public class Vehicle {

    // method overRiding
    public void stop(){
        System.out.println("stop the vehicle");
    }
}


Bike class:

package Method_OverRiding;

public class Bike extends Vehicle{
//    public void stop(){
//        System.out.println("stop the bike");
  //  }
}


Bicycle class:

package Method_OverRiding;

public class Bicycle {
    public void stop(){
        System.out.println("Stop the bicycle");
    }
}


Vehicle object:

package Method_OverRiding;

public class VehicleObject {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.stop();

        // bike object
        Bike bike = new Bike();
        bike.stop();

        // bicycle object
        Bicycle bicycle = new Bicycle();
        bicycle.stop();
    }
}


output:

stop the vehicle
stop the vehicle
Stop the bicycle

Process finished with exit code 0
