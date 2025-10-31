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
         while (first_digit > 0) {
            int digit = num / first_digit;
        
        // print
         if (first_digit >= 1000) {
                System.out.println(digit + " thousands");
            } else if (first_digit >= 100) {
                System.out.println(digit + " hundreds");
            } else if (first_digit >= 10) {
                System.out.println(digit + " tens");
            } else {
                System.out.println(digit + " ones");
            }
            num = num % first_digit;
            first_digit = first_digit / 10;
        }
    }
}

