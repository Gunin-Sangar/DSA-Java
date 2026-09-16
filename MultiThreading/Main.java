package MultiThreading;
/*
2 ways to create thread
METHOD 1: extend thread

start() tells java to start a thread, which executes run()
run() has actual work that thread performs
Btw Threads start from 0.
*/

class MyThread extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Thread-0 : "+i);
        }
        System.out.println();
    }
}

// While dealing with Thread class outputs vary
// That's because the JVM/operating system controls which thread gets CPU time.

class MyThread1 extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Thread-1 : "+i);
        }
        System.out.println();
    }
}


class MyThread2 extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Thread-2 : "+i);
            // Thread is written in try-catch to handle InterruptedException
            try{
            // sleep() pauses thread temporarily by some time
            Thread.sleep(30);
            }
            catch(InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
    }
}
class MyThread3 extends Thread{
    public void run(){
         for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        // start() tells java to start a thread, which executes run()
        MyThread t = new MyThread();
        t.start();

        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();

        MyThread3 t3 = new MyThread3();
        t3.start();
    }
}
