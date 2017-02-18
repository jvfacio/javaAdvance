/*
 * TestThread01.java
 *
 * Created on September 28, 2007, 1:06 PM
 *
 */

package multithreadexamples;

/**
 *
 * @author Hexaware
 */
public class TestThread01 {
    
    /** Creates a new instance of TestThread01 */
    public TestThread01() {
    }
    
    public static void main(String[] args){
        MyRunnable myRun = new MyRunnable();
        Thread myThread = new Thread(myRun);
        myThread.start();
        System.out.println("Continuing main method");
        
    }
    
}
