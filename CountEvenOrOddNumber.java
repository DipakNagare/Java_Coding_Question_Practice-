import java.util.*;;
public class CountEvenOrOddNumber {
    public static void main(String[] args) {
        
        int Num = 123456;
        int even_count = 0;
        int odd_count = 0;

        while (Num > 0) { // loop run util Number is not lessthan zero
            int rem = Num % 10; // seprerate the digit fom given number and like 123456 after 6.
            if (rem % 2 == 0) { // check the nume is even or odd if it is even then encrease the even count
                even_count++;
            }else{
                odd_count++;
            }
            Num = Num/10; // remove the last digit form Number and retrun the number ex-123456 they remove 6 and return 12345.
        }

        System.out.println("Even NUmber " + even_count + " & " + "Odd Count " + odd_count);
    }
}
