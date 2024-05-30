import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {


        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

/* Logic-1 : using Algorithem */
        
   /*     int rev = 0;

        while (num != 0) { // they check the conditon number is = to 0 or not if it is equal then they stop the loop otherwise continue.
             
                                         // first time                    Second time                     Third time                     // Fourth time
            rev  = rev * 10 + num % 10;  // 0 * 10 + 1234 % 10 = 4       // 4 * 10 + 123 % 10 = 43        // 43 * 10 + 12 % 10 = 432     // 432 * 10 + 1 % 10 = 4321
            num = num / 10;              // 1234/10 = 123                  // 123/10 = 12                   // 12/10 = 1                  // 1/10 = 0  after this zero came conditon is false and retrun the output.
        }

        System.out.println("Reverse Number is " + rev);
*/

/*Logic-2: using String buffer Class - reverse method */

/* 
StringBuffer sb = new StringBuffer(String.valueOf(num));  // using Sting.valueOf method they convert the number into string and using reverse method the reverse the number
StringBuffer reverseNumber = sb.reverse();

System.out.println("Reverse Number is : " + reverseNumber);
*/

/*Logic-3 : Using StringBuilder class reverse method */

StringBuilder sb = new StringBuilder();
sb.append(num); // to add this number into the sb object.
StringBuilder reverseNumber = sb.reverse();

System.out.println("Reverse Number is : " + reverseNumber);

    }
    
}
