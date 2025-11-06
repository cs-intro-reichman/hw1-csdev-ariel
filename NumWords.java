// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
    public static void main(String[] args) {
        // pick a number
        int num = Integer.parseInt(args[0]);
        int temp = num;

        // learn what is the length of the number
         int length = 0;
        while (temp > 0) {
            temp = temp / 10;
            length = length + 1;
        }

        // what is the largest digit
          int first_digit = 1;
        for (int i = 1; i < length; i++) {
            first_digit = first_digit * 10;
        }

        // extract digits
        int thousands = num / 1000;
        int hundreds = (num % 1000) / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;

        // print
         boolean printed = false;
         if (thousands > 0) {
            System.out.print(thousands + " thousands");
            printed = true;
        }
        if (hundreds > 0 || printed) {
            if (printed) System.out.print(", ");
            System.out.print(hundreds + " hundreds");
            printed = true; }
            if (tens > 0 || printed) {
                if (printed) System.out.print(", ");
                System.out.print(tens + " tens");
                printed = true;
            }
            if (printed) System.out.print(", and ");
            System.out.println(ones + " ones.");
        }
    }

