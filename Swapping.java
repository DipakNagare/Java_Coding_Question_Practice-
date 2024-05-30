public class Swapping{
    public static void main(String[] args) {
        
        int a,b;
        a=10;
        b=20;

        System.out.println("before Swapping " + "a = " + a + "  " + "b = " + b);

        /*Logic-1 - Using THird veriable.*/

        // int c = a;
        // a = b;
        // b = c;

        // System.out.println("After Swapping " + "a = " + a + "  " + "b = " + b);

        /* logig-2 : using + and - operator*/

        // a = a + b; // 10 + 20 = 30
        // b = a - b; // 30 - 20 = 10
        // a = a - b; // 30 - 10 = 20

        // System.out.println("After Swapping " + "a = " + a + "  " + "b = " + b);
       
        /* logic-3: using * and / Operator ( this logic is not usefull when both veriable value is Zero(0) otherwise they showing the arithmatic exception)*/

        // a = a * b;  // 10 * 20 = 200
        // b = a / b;  // 200 / 20 = 10
        // a = a / b;  // 200 / 10 = 20

        // System.out.println("After Swapping " + "a = " + a + "  " + "b = " + b);

        /* Logic-4: using Bitwise XOR(^) operator */

        // a = a ^ b; //first they convert the number into binary form and then they refered the XOR table and that XOR table output convert into agin number form and return the Output.
        // b = a ^ b;
        // a = a ^ b;

        // System.out.println("After Swapping " + "a = " + a + "  " + "b = " + b);

        /*Logic-5 : Using Single Statement */

        b = a + b - (a = b);
        
        System.out.println("After Swapping " + "a = " + a + "  " + "b = " + b);

    }
}