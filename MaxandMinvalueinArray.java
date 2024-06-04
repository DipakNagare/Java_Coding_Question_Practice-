public class MaxandMinvalueinArray {
    public static void main(String[] args) {
        
        int a[] = {23,4,566,7,56};

        int max = a[0]; // assume this array element max number and copair this max with all elements of array using for loop

        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){   // check array elements is grether than max number
                max = a[i];      // if array elements is grether than max number thin store this number into the max veriable.
            }
        }
        System.out.println("Maximum value in array: " + max);

        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimun value in array: " + min);


    }
}
