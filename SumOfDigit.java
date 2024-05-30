public class SumOfDigit {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while (num > 0) {

            sum = sum + num % 10;  // num % 10 is retrun the last digit of number and then they perform add operation ad store the number ito sum veriable

            num = num/10; // they also remove the last number and return the al ther number of digit
        }
        System.out.println("sum of digit is " + sum);
    }
}
