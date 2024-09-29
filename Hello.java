public class Hello {


    public static void main(String[] args) {
        System.out.println("Hello Java Learner...");
        sum();

        int result = multiply(12, 5);
        System.out.println("multiplications is : "+result);
    
    }

    // without return type and parameter 
    static void sum (){
        int a = 12;
        int b = 34;
        int sum = a+b;
        System.out.println("Sum of two numbers is : "+sum);
    }

    // return type with parameters as well 
    static int multiply(int a ,int b)
    {
        return a*b;
    }
   
}
