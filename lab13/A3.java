class odd implements Runnable{
    Thread T1;
    int n1,n2;
    public odd(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
        T1=new Thread(this);
        T1.start();
    }
    public void run(){
        for(int i=0;i<n2;i++){
            if (i%2!=0) {
                System.out.println("odd number is :"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
class even implements Runnable{
    Thread T1;
    int n1,n2;
    public even(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
        T1=new Thread(this);
        T1.start();
    }
    public void run(){
        for(int i=0;i<n2;i++){
            if (i%2==0) {
                System.out.println("even number is :"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
public class A3 {
    public static void main(String[] args) {
        new even(1, 20);   
        new odd(1, 20);  
    }
}
