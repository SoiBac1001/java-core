/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core;

/**
 *
 * @author os_baonv
 */
public class Test_Sleep extends Thread{
    public void run(){
        for(int i=1; i<5; i++){
            try {
                Thread.sleep(2000); // tạm ngứng một thread cho một khoảng thời gian nhất định.
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Test_Sleep t1 = new Test_Sleep();
        Test_Sleep t2 = new Test_Sleep();
        t1.start();
        t2.start();
    }
}
