/*
 * MyRunnable01.java
 *
 * Created on September 28, 2007, 12:56 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package multithreadexamples;

/**
 *
 * @author Hexaware
 */
public class MyRunnable implements Runnable{
    
    /** Creates a new instance of MyRunnable01 */
    public MyRunnable() {
    }

    public void run() {
        System.out.println("Inside MyRunnable - run() method!");
    }
    
}
