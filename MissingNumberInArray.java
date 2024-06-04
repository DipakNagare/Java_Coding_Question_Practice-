public class MissingNumberInArray {
    public static void main(String[] args) {
 
        /*Conditon for finding Missing Number In Array */
        // Array should not be sorted.
        // Array should not have duplicates elements
        // Value should be in proper range.
        
        int a[] = {1,2,3,4,5,7,8,9,10};

        int sum1 = 0;

        for (int i = 0; i < a.length; i++) {  // This loop count the sum of elements of array
            sum1 = sum1 + a[i];
        }
        System.out.println(" Sum of elements of array : " + sum1);

        int sum2 = 0;

        for (int i = 1; i <= 10; i++) {    // this array calulate the sum beetwen range 1 to 5 elements based on range of array
            
            sum2 = sum2 + i;            // here the calculate the addition of elemenens in range 1,2,3,4,5 means the include missing number.
        }
        System.out.println(" Sum in range of array : " + sum2);

        int MissingNumber = sum2 - sum1; // they minus the some or elements of arary and sum on range of 1 to 5 valuh then they give the retrun missing number.

        System.out.println("Missing Number: " + MissingNumber);
    }
}
