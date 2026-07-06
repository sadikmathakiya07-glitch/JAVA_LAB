import java.util.Scanner;
class AT1 implements Runnable{
    Thread t;
    public AT1(){
        t=new Thread(this);
        t.start();
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
public class A1_2 {
    public static void main(String[] args) {
       new AT1();
    }
    
}
