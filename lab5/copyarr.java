public class copyarr {
   
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter array size : ");
        int s = sc.nextInt();
        int ar1[] = new int[s];
        int ar2[] = new int[s];
        copyarr obj = new copyarr();
        obj.copyArray(ar1, ar2);
    }
    void copyArray(int ar1[], int ar2[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < ar1.length; i++) {
            System.out.println("enter ar1[" + i + "] : ");
            ar1[i] = sc.nextInt();
        }
        for (int i = 0; i < ar1.length; i++) {
            ar2[i] = ar1[i];
        }
        System.out.println("Copied array elements are : ");
        for (int i = 0; i < ar2.length; i++) {
            System.out.println("ar2[" + i + "] = " + ar2[i]);
        }
    }


}
