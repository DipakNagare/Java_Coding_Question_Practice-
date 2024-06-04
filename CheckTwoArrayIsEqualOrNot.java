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

    boolean status = true;  //consider array bydefault same 

    if(a1.length == a2.length){   // then check the length of both array same if same then go inside the condition otherwise print satus is false in else condition
        for(int i = 0; i<a1.length;i++){  // loop itrate a1[] array
            if (a1[i] != a2[i]) { // here we compair elemnt of a1[] and a2[] if it is not match then staus is false meanse not match the array
                status = false;
            }
        }

    }
    else{
        status = false;
    }

    // check now what is the status if it is ture then then both array is match other wise not match
    if (status == true) {
        System.out.println("Both array is same");
        
    }
    else{
        System.out.println("Both array is not same");
    }
}

}