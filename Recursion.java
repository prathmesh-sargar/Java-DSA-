
public class Recursion {

    public static void main(String[] args) {
        
        int ans = fibonachi(10);
        System.out.println(ans);
    }

    // finding nth fibonachi of given number ......
    static int fibonachi(int n ){

        if (n<2){
            return n;
        }
        return fibonachi(n-1) + fibonachi(n-2);
    }

}
