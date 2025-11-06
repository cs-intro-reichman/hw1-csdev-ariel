// Computes the future value of a saving investment.
public class FVCalc {
    public static void main(String[] args) {
 // define our 3 values
        int currentValue = Integer.parseInt(args[0]);
        double rate_percentage = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
    
    // calculations
        double rate = rate_percentage / 100;
        double futureValue = currentValue * Math.pow(1 + rate ,n);
    //round up
        long futureValue1 = Math.round(futureValue);


    // print
    System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate_percentage + "% will yield $" + futureValue1);
    }
}