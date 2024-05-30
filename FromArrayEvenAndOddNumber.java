public class FromArrayEvenAndOddNumber {
    public static void main(String[] args) {
        
        int a[] = {1,2,4,5,6,7,8,9};

        /*Using Simple for loop */

        //   for (int i = 0; i < a.length; i++) {
        //     if (a[i] % 2 == 0) {
        //         System.out.println("Even Number is: " + a[i]);
        //     }
        //   }

        //   for (int i = 0; i < a.length; i++) {
        //     if (a[i] % 2 != 0) {
        //         System.out.println("Odd Number is: " + a[i]);
        //     }
        //   }

          /* Using For each loop or Enhanced loop */

          for(int itterateArray : a){
            if(itterateArray % 2 == 0){
                System.out.println("Even Number is: " + itterateArray);
            }
          }
          for(int itterateArray : a){
            if(itterateArray % 2 != 0){
                System.out.println("Odd Number is: " + itterateArray);
            }
          }
    }
}
