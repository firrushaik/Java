
package Threads;

class Counter{
    int count;

    public void inrement(){
        count++;
    }
}



public class RaceConditionEx {
    public static void main(String[] args) {
        Counter count = new Counter();

        Runnable runnable = () -> {
            for(int i = 0; i<1000;i++){
                count.inrement();
            }
        };


        Runnable runnable1 = () -> {
            for(int i = 0; i<1000;i++){
                count.inrement();
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable1);

        System.out.println(t1.isAlive());
        t1.start();
        t2.start();

        //join() it will stop the thread still particular thread is completed
//        t1.join();
//        t2.join();
//        System.out.println("line 25");
//        System.out.println(counter.count); // 2000
   }
}


o/p:

false
