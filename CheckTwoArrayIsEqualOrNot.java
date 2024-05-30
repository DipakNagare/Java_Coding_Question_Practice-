import java.util.*;

public class CheckTwoArrayIsEqualOrNot {

    public static void main(String[] args) {
    
    int a1[] = {1,2,3,4,5,6};
    int a2[] = {1,2,3,4,7,6};

    /*logic - 1 : Using Arrays.eaual() method direct */

    // boolean status = Arrays.equals(a1,a2);   // create one boolen veriable beacuse method retrun the boolean response  and then use to compair Arrays.equales() to check array is equal or not.
    
    // if(status == true){
    //     System.out.println("Both array is same");
    // }
    // else{
    //     System.out.println("Both array is not same");
    // }

    /*Logic - 2 : using some conditions */

    boolean status = true;

    if(a1.length == a2.length){
        for(int i = 0; i<a1.length;i++){
            if (a1[i] != a2[i]) {
                status = false;
            }
        }

    }
    else{
        status = false;
    }

    if (status == true) {
        System.out.println("Both array is same");
        
    }
    else{
        System.out.println("Both array is not same");
    }
}

}