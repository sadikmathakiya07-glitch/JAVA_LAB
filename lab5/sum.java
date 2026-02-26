import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size : ");
        int s=sc.nextInt();
        int ar[] =new int[s];
        sum obj=new sum();
        obj.sumarr(ar);
        }
       
       
     void sumarr(int ar[]){
         int sum=0;
          Scanner sc=new Scanner(System.in);
        for(int i=0;i<ar.length;i++){
            System.out.println("enter a["+i+"] : ");
            int a=sc.nextInt();
            sum=sum+a;
    }
     System.out.println("sum = "+sum);
}


     public void arravg() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'arravg'");
     }
}

