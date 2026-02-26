import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number :");
        int n=sc.nextInt();
    prime obj=new prime();
    obj.check(n);
    }
    void check(int x){
        int c=0;
        for(int i=1;i<=x;i++){
            if (x%i==0) {
                c++;
            }
            else{
                continue;
            }
        }
        if (c==2) {
            System.out.println("--->number is prime<---");
        }else{
            System.out.println("--->number is not prime<---");
        }
    }
}
