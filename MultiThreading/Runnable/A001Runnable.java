package MultiThreading.Runnable;
// METHOD 2: Runnable
/*
Second way is to use Runnable interface
in this we implement Runnable, and it represents the task and
Thread represents the thread that will run that task

This method exists so that thread functionality is achieved with inheritance.

Thread = the worker, Runnable = the job the worker performs. refer to
[[[A002Runnable for an eg]]]

Why is runnable useful? [SOLID principal]
 - it creates a separation of responsibility.
 - with thread you a mixing of 2 things thread and task
      MyThread
      ├── Thread → "I am a thread"
      └── Task   → "I have some work to do"

 With runnable you have:
        MyTask
        └── Task → "I have some work to do"

        Thread
        └── Worker → "I will execute that task"

 the main thing that makes this useful is that you can give the same task to multiple threads
 [[[A002Runnable for an eg]]]

class extends Thread                class implements Runnable
     ↓                                       ↓
Your class IS a Thread              Your class IS A TASK
                                             ↓
                                    A Thread runs that task
 */

class MyTask implements Runnable{
    @Override
    public void run(){
        System.out.println("hello");
    }
}

public class A001Runnable {
    public static void main(String[] args) {
        MyTask task = new MyTask(); // no thread created yet only the task
        Thread t = new Thread(task); // Thread created to run the task tsk
        t.start();
    }
}
