/*
 * EX03Main.java
 *
 * Created on October 3, 2007, 1:52 PM
 *
 */

package multithreadexamples;

/**
 *
 * @author Hexaware
 */
public class EX03Main {
    //dummy class with just static void main
    public static void main(String[] args){
        //let's create two threads with the same Runnable instance
        EX03Runnable runnable = new EX03Runnable();
        //first thread
        Thread thread1 = new Thread(runnable,"Thread 1");
        //second thread also has same runnable instance - object sharing
        Thread thread2 = new Thread(runnable,"Thread 2");
        //Let's start the threads!
        thread1.start();
        thread2.start();
    }
}
