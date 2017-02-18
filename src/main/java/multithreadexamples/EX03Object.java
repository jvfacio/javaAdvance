/*
 * EX03Object.java
 *
 * Created on October 3, 2007, 1:29 PM
 *
 */

package multithreadexamples;

/**
 *
 * @author Hexaware
 */
public class EX03Object {
    
    private int value=50;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public int reduceValue(int a){
        System.out.println("Reducing the value in object : current value = "+value);
        value = value - a;
        System.out.println("Reducing the value in object : new value = "+value);
        return value;
    }
}
