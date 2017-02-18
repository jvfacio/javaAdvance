/*
 * EX01Runnable.java
 *
 * Created on October 3, 2007, 12:42 PM
 *
 */

package multithreadexamples;

/**
 *
 * @author Hexaware
 */
public class EX02Runnable implements Runnable{
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("I am in Thread "+Thread.currentThread().getName()+" and i = "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        //let's create the first thread based on EX02Runnable
        Thread thread1 = new Thread(new EX02Runnable(),"One");
        //Now the second thread. 
        Thread thread2 = new Thread(new EX02Runnable(),"Two");
        //Until now, both thread1 and thread2 are in "New" state.
        //Let's start the threads
        thread2.start();
        thread1.start();
        System.out.println("Main method ends here!");
    }    
}
