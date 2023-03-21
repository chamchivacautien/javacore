/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Long Nguyen
 */
public class Main {

    public static void main(String[] args) {
//        Exam1 e = new Exam1();
//        e.run();
        Thread t = new Thread(new Exam1());
        t.start();
        try {
            t.join(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        });
        
        t1.start();
        
    }

}

class Exam1 implements Runnable {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Bye bye");

    }
}
