public class FebonacciSeries {
    public static void main(String[] args) {
        // first define the two veriable and store in this 0 and 1;
        
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        for (int i = 2; i < 10; i++) {     // they start form 2 beacuse we already print the 1 and they print 10 febonacci value
            sum  = n1 + n2;         // they performing sum operation on number
            n1 = n2;               // then assign n1 value to the n2
            n2 = sum;              // and then n2 value to the sum to pring the febonacci series.

            System.out.print(" " + sum);


        }
    }
}
