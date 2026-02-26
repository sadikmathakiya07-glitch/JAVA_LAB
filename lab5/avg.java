import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size : ");
        int s=sc.nextInt();
        int ar[] =new int[s];
        avg obj=new avg();
        obj.arravg(ar);
        }
         void arravg(int ar[]){
         int sum=0;
          Scanner sc=new Scanner(System.in);
        for(int i=0;i<ar.length;i++){
            System.out.println("enter a["+i+"] : ");
            int a=sc.nextInt();
            sum=sum+a;
    }
    float avg=sum/ar.length;
     System.out.println("avg = "+avg);
}
}
