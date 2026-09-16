package MultiThreading.Runnable;
/*
The inheritance issue solved by Runnable

    class SomeOtherClass{}

    class MyTask2 extends SomeOtherClass implements Runnable {
        public void run() {
             work...
        }
    }
*/

class MyTask2 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Doing the work...");
    }
}

public class A002RunnableDemo {
    public static void main(String[] args) {
        MyTask2 task = new MyTask2();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        // multiple threads working on same task
        t1.start();
        t2.start();
        t3.start();
    }
}
