import java.util.Scanner;
class Th1 extends Thread{
    public Th1(){
        start();
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("number:"+i);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        }
    }
}
public class A1_1 {
    public static void main(String[] args) {
    Th1 t1= new Th1();
    t1.start();
    
    }
}