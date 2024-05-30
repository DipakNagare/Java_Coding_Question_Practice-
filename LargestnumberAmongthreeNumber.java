import java.util.*;
public class LargestnumberAmongthreeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second number: ");
        int b = sc.nextInt();

        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        /* Using If and else if.... */

        // if (a > b && a > c) {
        //     System.out.println("a is largest: " + a);  
        // }
        // else if (b > a && b > c) {
        //     System.out.println("B is largest: " + b);  
        // }
        // else{
        //     System.out.println("c is largest: " + c);
        // }

        // int larg = a > b ? a : b; // they retrun the largest number beetween a and b int larg veriable;

        //  int LargestnumberAmongthreeNumber = c > larg ? c : larg;  // then they compair the large veriable with c if c is large then they retrun the c other wise hey return large number of a and b;
          
        // System.out.println("largest number is: " + LargestnumberAmongthreeNumber);


        // in one line code we want to do then 

        int largestNum = c > (a > b ? a : b) ? c : (a > b ? a : b);
        System.out.println("largest number is: " + largestNum);

    }
}
