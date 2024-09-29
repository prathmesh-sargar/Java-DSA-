
import java.util.Arrays;

public class SpreedOpr {
    
    public static void main(String[] args) {
        
        SpreedOperator(12,23,435,56,67,78,89);

        
    }



    
     // ...num variable length argument
    static void SpreedOperator(int ...num){
         // System.out.println(num);      It gives garbage value 
        System.out.println(Arrays.toString(num));
    }


   

}
