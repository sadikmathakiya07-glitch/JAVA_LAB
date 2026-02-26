import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first subject mark : ");
        int s1=sc.nextInt();
         System.out.println("enter second subject mark : ");
         int s2=sc.nextInt();
          System.out.println("enter third subject mark : ");
          int s3=sc.nextInt();
           System.out.println("enter fourth subject mark : ");
           int s4=sc.nextInt();
            System.out.println("enter fifth subject mark : ");
            int s5=sc.nextInt();
            float p;
            p=(s1+s2+s3+s4+s5)/5;
            division obj=new division();
            obj.percentage(p);
    }
    void percentage(float p){
          if (p>=60) {
            System.out.println("you are in first division ");
          }
          else if (50<=p && 59>=p) {
             System.out.println("you are in secnd division ");
          }else if (40<=p && 49>=p) {
             System.out.println("you are in third division ");
          }else {
             System.out.println("you are fail in exam  ");
             System.out.println("---->batter luck next time<----");
          }
    }
}
