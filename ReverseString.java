public class ReverseString {
    public static void main(String[] args) {
        
        /*Logi-1 : using + (concatanation operator) */

       String Str = "abcd";
        String rev = "";
 /*
        int len = Str.length(); // they calculate the lenght of string using length() method and now retrun 4

        for(int i=len-1;i>=0;i--){
            rev = rev + Str.charAt(i);
        }

        System.out.println("Reverse String : " + rev);

        */

        /* Logic-2: Using charecter array */

        /*   
        char a[] = Str.toCharArray(); // firste cretae one char array and then I  added the String into in charArray then they seprate the each alphabet and store in charArray

        int len = Str.length(); // count the lenth of String

        for(int i=len-1; i>=0; i--){ 
            rev = rev + a[i];          // they store the last alphabet in rev until the condition is ture. 
        }
        System.out.println("Reverse String : " + rev);
        */
    
        /*Logic -3 : Using The String buffer class */

        StringBuffer sb = new StringBuffer(Str);  // we creat the one String buffer object and store the string in this object
        System.out.println("reverse String : " + sb.reverse());  // then we use the direct reverse methos to revrse the string
    }
}
