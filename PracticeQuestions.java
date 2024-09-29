import java.util.Scanner;

public class PracticeQuestions {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // System.out.print("Enter the numbers : ");
        // int num = input.nextInt();
        // int num2 = input.nextInt();
        // int num3 = input.nextInt();
    

        // System.out.print("Enter Character : ");
        // char ch = input.next().charAt(0);

      // System.out.println(" Is prime Number = " +isPrime(num));
    //   System.out.println("Largest nmber is : "+largestNumber(num1,num2,num3));
    // System.out.println("Max Number is :  "+MaxNum(num1, num2, num3));

    // System.out.println(" Is Uppercase : "+checkUpperCase(ch));
    // System.out.println(" Is Lowercase  : "+checkLowerCase(ch));

    // System.out.print("Enter number :" );
    // System.out.println("nth fibonachi of "+num+ " is : "+nthFibonachi(num));

    System.out.print("Fibonachi Series : ");
    nthFibonachi(8);
    
    input.close();
        
    }

    // Prime number program 
    static boolean isPrime(int n) {
         if(n<=1)
         {
            return false;
         }

         int c = 2;
         while(c*c < n)
         {
            if(n % c ==0 )
            {
                 return false;
            }
            c++;
         }

         return c*c > n;
        
    }


    // Largest number between 3 numbers 
    static int largestNumber(int a, int b , int c ){

        int max = a;
        if(b > max ){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max ;

    }


    // simple short steps 
    static int  MaxNum(int a ,int b ,int c ){
        int max = Math.max(a, Math.max(a, c));
        return max; 
    }

    // Check Uppercase Is 
    static boolean checkUpperCase(char ch){

        if(ch >='a' && ch <= 'z'){
            return false;
        }
        else 
           return true;
        
    }

    
    // Check Lowercase Is 
    static boolean checkLowerCase(char ch){

        if(ch >='A' && ch <= 'Z')
        {
            return false;
        }
        else
        return true;
    }


    // find nth fibonachi number : 
    static void nthFibonachi(int num){

        int a = 0;
        int b = 1;
        

        int count = 2;
        while( count <=num){

            int c = a+b;
            System.out.print(a + " ");
            a=b;
            b=c;
           count ++;
        }
         
        //  System.out.println(a);
       
    }
}





