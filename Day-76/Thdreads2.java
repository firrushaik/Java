
package Threads;

class Car1 extends Thread{
    public void carName(){
        for(int i=0;i<=30;i++){
            System.out.println("BMW");
        }
    }
}

class Bike extends Thread{
    public void bike(){
        for(int i=0;i<=30;i++){
            System.out.println("Pulsar");
        }
    }
}


public class ThreadsEx {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.carName();

        Bike bike = new Bike();
        bike.bike();
    }
}




o/p:

BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
BMW
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar
Pulsar

