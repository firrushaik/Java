
package Threads;

class Car extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("BMW");

            // when we put ad thread as sleep mode we must put it into try and catch blocks
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

class Bikes extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hero Honda");

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}



public class ThreadEx2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Bikes bikes = new Bikes();
        bikes.start();

        System.out.println("Line no 30");

        // multiple threads works at a time start() -> run()
    }
}




op:

BMW
Line no 30
Hero Honda
Hero Honda
BMW
BMW
Hero Honda
Hero Honda
BMW
BMW
Hero Honda
BMW
Hero Honda
Hero Honda
BMW
Hero Honda
BMW
BMW
Hero Honda
Hero Honda
BMW
BMW
Hero Honda
BMW
Hero Honda
Hero Honda
BMW
Hero Honda
BMW
BMW
Hero Honda
Hero Honda
BMW
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
Hero Honda
BMW
BMW
Hero Honda
BMW
Hero Honda
Hero Honda
BMW
BMW
Hero Honda
Hero Honda
BMW
Hero Honda
BMW
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
Hero Honda
BMW
Hero Honda
BMW
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
Hero Honda
BMW
BMW
Hero Honda
BMW
Hero Honda
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
BMW
Hero Honda
Hero Honda
BMW
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
Hero Honda
BMW
BMW
Hero Honda
Hero Honda
BMW
Hero Honda
BMW
Hero Honda
BMW
BMW
Hero Honda
BMW
Hero Honda
