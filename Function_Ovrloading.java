public class Function_Ovrloading {
    
    public static void main(String[] args) {
        

        // methoding Overloading :  Two methods  having same name 
        System.out.print("Some of two numbers : "+sum(12,10));

        // int result = sum(12, 12, 12);
        

       

    }

    static int sum(int num1 , int num2){
    
           int sum = num1+num2;
           return sum;
    }
    static int sum(int num1 ,int num2, int num3){

        return num1+num2+num3;
    }
}
