import java.util.Arrays;
import java.util.Scanner;
class a1 {
    int[] a1 = { 3, 6, 8, 10, 1 };
   int[] a2 = Arrays.copyOf(a1,a1.length);
    public int[] getpritnar(){
        return a1;
       
    }

    void sort_array() {
        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] > a1[j]) {
                    int temp;
                    temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;
                }
            }
        }
        System.out.println("sorted array : "+Arrays.toString(a1));
        
        }

        void sarch_array(){
            
            System.out.print("enter element to search : ");
            Scanner sc=new Scanner(System.in);
            int e=sc.nextInt();
            for(int i=0;i<a1.length;i++){
                if (a2[i]==e) {
                    System.out.print("your element index is : "+i);
                }
                
            }
        
        }
       int sum_array(){
        int sum=0;
        for(int i=0;i<a1.length;i++){
            sum=sum+a1[i];
        }
        System.out.println("sum of array element : "+sum);
        return sum;
       }
       void avg_array(){
        a1 obj=new a1();
        float s=obj.sum_array();
        float avg=(s/a1.length);
        System.out.println("avg of element : "+avg);
       }

    }


public class Array_opration {
    public static void main(String[] args) {
        a1 obj = new a1();
           System.out.println("original array : "+Arrays.toString(obj.getpritnar()));
        
        obj.sort_array();
        obj.sarch_array();
        obj.sum_array();
        obj.avg_array();
    }

}
