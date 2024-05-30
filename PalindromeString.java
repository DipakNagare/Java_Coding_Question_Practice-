public class PalindromeString {
    public static void main(String[] args) {
        
        String str = "madam";
        String rev = "";
        int len = str.length();

        String org_s = str;


        for(int i = len - 1; i>=0 ; i--){
            rev = rev + str.charAt(i);
        }

        if(org_s.equals(rev)) {
            System.out.println("it is not palindrome"); 
        }
        else{
            System.out.println("it is not palindrome"); 
        }

    }
    
}
