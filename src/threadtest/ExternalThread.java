/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

/**
 *
 * @author fgarcia
 */
public class ExternalThread extends Thread {
    String Name;
    int number;
    
    
    ExternalThread(String n) {
        this.Name=n;
        this.number=0;
    }

    synchronized void IncrementNumber() {
        number++;
    }
    
    synchronized int getNumber() {
        return number;
    }
    
    public void run() {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };
        try {
            for (int i = 0;
                    i < importantInfo.length;
                    i++) {
                // Pause for 4 seconds
                Thread.sleep(3000);
                // Print a message
                System.out.println(Name+": "+getNumber());
                IncrementNumber();
            }
        } catch (InterruptedException e) {
            System.out.println(Name+": I wansn't done!!!");
        }
        System.out.println("External FINISHED!!!!");
    }
}
