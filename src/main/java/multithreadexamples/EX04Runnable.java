/*
 * EX04Runnable.java
 *
 * Created on October 3, 2007, 3:05 PM
 *
 */

package multithreadexamples;

/**
 *
 * @author Hexaware
 */
public class EX04Runnable implements Runnable {
    private EX04Object ex04Object = new EX04Object();
    //This thread (run) will reduce the  value in EX03Object 10 times.
    public void run(){
        for(int i=0;i<10;i++){
            synchronized (ex04Object){
                reduce(i);
            }
        }
    }
    
    private void reduce(int i){
        if (ex04Object.getValue()>=10){
            System.out.println("Check done by thread: "+Thread.currentThread().getName()+" and i = "+i);
            try {
                //Before reducing let's sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
            //after sleeping let's reduce the value by 10
            System.out.println("Run by thread: "+Thread.currentThread().getName()+" and i = "+i);
            ex04Object.reduceValue(10);
        }
        else{
            //We should not reduce here
            System.out.println("value < 10, cannot reduce by 10 - From "+Thread.currentThread().getName());
        }        
    }
}
