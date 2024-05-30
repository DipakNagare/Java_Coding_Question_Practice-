import java.util.*;

// Natural Number  > 1
// Whch has only factor 1 And itself.

public class PrimeOrNotPrime {
    public static void main(String[] args) {

        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        // Using simple logic
        /*
          if (num % 2 != 0) {
          System.out.println("Number is prime");
          }
          else{
          System.out.println("Number is not prime");
          }
         */


 /*Using anothe logic */

 if (num > 1) {   // first check the nuber is greathe than 1 or not if it is go inside the loop

    for (int i = 1; i <= num; i++) {  // they run loop until the number is less than i.
        if (num % i == 0) { // they check the how many time they devide the nubmer so based on this they increase the count value for every time if number is divided
            count++;
        }  
    }
    if (count == 2) {  // means they number if divede 1 and itself then only they giving count value 2 if they give divid many time then they so not prime.
        System.out.println("Number is prime");
    }
    else{
        System.out.println("Number is not prime");
    }
 }
 else{
    System.out.println("It is Palindrome");
 }



    }
}
