import java.util.Scanner;

public class DigitBase {
    
    public static void main(String[] args) {

        System.out.print("Enter Number : ");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

    //    System.out.print("Input checked number : ");
    //    int checknum = sc.nextInt();

       // count Digit : 
    //    System.out.println("Number of Digit is : "+countDigit(num));

        //   checkNumber(num, checknum);
    
    System.out.println("Rever numbers : "+ReverseNumber(num));


      sc.close();

      
    }



    // count number of digits in given input number 
    static int countDigit(int num ){

        int count = 0;
        while(num > 0){
            num = num /10;
            count++;
        }
        return count;
    }


    // Find particular Digit in give input number 
    static void checkNumber(int num ,int checknumber ){

        int count =0;
        while(num > 0){

            int rem = num %10;
            
            if(rem == checknumber){
                // System.out.println(rem);
                count++;
            }
            num = num /10;
            
        }
        System.out.print(count + " number of times ");

    }


    // Reverse given input numbers 
    static int ReverseNumber(int num){

         int  res = 0;
         int rem;
        while(num > 0){

            rem = num %10;
            res = res *10+rem;
            num = num/10;
        }
        return res;

    }


     

}

