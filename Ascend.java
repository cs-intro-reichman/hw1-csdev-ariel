// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
    public static void main(String[] args) {
        // generate 3 numbers + limit number
        int lim = Integer.parseInt(args[0]);
        int random1 = (int) (Math.random() * (lim + 1));
        int random2 = (int) (Math.random() * (lim + 1));
        int random3 = (int) (Math.random() * (lim + 1));

    // find min, mid, max
        int min_num = Math.min(random1, Math.min(random2, random3));
        int max_num = Math.max(random1, Math.max(random2, random3));
        int mid_num = random1 + random2 + random3 - max_num - min_num;
        
    // print the randoms
    System.out.println(random1 + " " + random2 + " " + random3);
    // print ascending
    System.out.println(min_num + " " + mid_num + " " + max_num);
    }
}

