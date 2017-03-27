/*
 * Code written by Eli Weitzman and Eli Griffith
 * ChemLab Calc
 * 3/24/17
 * JDK v. 1.8.0
 */
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class ChemLabs {
    public static void main(String[] args) throws InterruptedException {
        double temperature = Math.random();
        double tempToCrement;
        temperature = temperature * 200;
        while(true) {
            tempToCrement = Math.random() * 5;
            if(temperature <= 102.5){
                System.out.println("Temperature is normal | " + temperature);
                temperature += tempToCrement;
                TimeUnit.SECONDS.sleep((long) 5.00);
         }else {
                temperature-= tempToCrement;
            Toolkit.getDefaultToolkit().beep();
            TimeUnit.SECONDS.sleep((long) 5.00);
            System.out.println("Temperature is excessive | " + temperature);
            }    
        }
    }
    
}
