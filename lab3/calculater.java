import java.util.Scanner;

public class calculater {
     static void calculater(){
        float a,b;
        String s,c;
        System.out.println("enter a :");
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
       System.out.println("enter b :");
       b = sc.nextInt();
       System.out.println("enter your choise (+ , - , / , * , % ):");
        s=sc.next();
        switch (s) {
            case "+":
                System.out.println("result:"+(a+b));
                main(null);
                break;
            case "-":  
            System.out.println("result:"+(a-b));
             main(null);
            break;
            case"/":
        float f;
        f=a/b;
       System.out.println("result:"+f);
        main(null);
          break;
        
        case "*":
            System.out.println("result:"+(a*b));
             main(null);

break;
           
            case "%":
               System.out.println("result:"+(a%b));
                main(null);
          break;
               
            default:
                System.out.println("unable to answer");
          break;
        }
        
}
public static void main(String[] args){
            System.out.println("you want to more calculation(y,n):");
            String d;
            Scanner sc1=new Scanner(System.in);
            d=sc1.next();
           
            switch (d) {
                case "y":
                    
                    calculater();
            
                default:

                   System.out.println("you have been exit");
            }
        }
}
