public class SumOfArray {
    public static void main(String[] args) {

        int a[] = {5,2,6,9,7};

        int sum = 0;

        /* Usign for loop of array */
       /*  for (int i = 0; i < a.length; i++) {  // they run until the size of array is not greter than
            sum = sum + a[i];   // they adding each element of array in a[i] one by one and then after addition they store in veriable sum.
        }
        System.out.println("Sum of array is: " + sum);

        */

        /* Using for ech loop or enhanced loop */

        for(int arrayelement : a){  // in this just create one int veriable inside the for loop like (arrayelement) and use this : sign and give your array name like (:a)
            sum = sum + arrayelement; //  (arrayelement) this veriable itterate one one veriable and perform sum operation with sum veriable.
        }
        System.out.println("Sum of array is: " + sum);

    }
}
