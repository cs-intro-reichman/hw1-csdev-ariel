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
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;

        // print
        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
    }
}

