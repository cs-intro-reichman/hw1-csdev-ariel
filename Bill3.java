public class Bill3 {
    public static void main(String[] args) {
 // 3 names as strings
        String person1 = args[0];
        String person2 = args[1];
        String person3 = args[2];

// The sum of the diner for everybody
        int bill_sum = Integer.parseInt(args[3]);

// bill devide by 3 and rounded up using math ceil function
double bill = Math.ceil(bill_sum / 3.0);

// print the amount of shekels that each person need to pay for the bill
System.out.println("Dear " + person3 + ", " + person2 + " and " + person1 + ": pay " + bill + " Shekels each.");

    }
 }