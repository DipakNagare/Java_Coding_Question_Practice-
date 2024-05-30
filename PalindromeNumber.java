public class PalindromeNumber {
    public static void main(String[] args) {
        
        int num = 34343424;
        int rev = 0;
        int org_num = num;

       /*   StringBuilder sb1 = new StringBuilder();
        sb1.append(org_num);

        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
*/

while (num !=0) {
    rev = rev * 10 + rev % 10;
    num = num / 10;

}
        if (rev == org_num) {
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }


    }
}
