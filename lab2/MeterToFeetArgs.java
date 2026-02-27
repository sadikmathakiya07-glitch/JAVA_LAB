public class MeterToFeetArgs {
    public static void main(String[] args) {
       
        
        double meters = Double.parseDouble(args[0]);

        
        double feet = meters * 3.28084;

         
        System.out.println(meters + " meters is equal to " + feet + " feet.");
    }
}