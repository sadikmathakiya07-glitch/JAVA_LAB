class goodmorning implements Runnable{
    Thread T;
    public goodmorning(){
        T=new Thread(this);
        T.start();
    }
    public void run(){
        while (true) {
            System.out.println("Good morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class goodafternoon implements Runnable{
    Thread T;
    public goodafternoon(){
        T=new Thread(this);
        T.start();
    }
    public void run(){
        while (true) {
            System.out.println("Good afternoon");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class A2 {
    public static void main(String[] args) {
        new goodmorning();
         
        new goodafternoon();

    }
}
