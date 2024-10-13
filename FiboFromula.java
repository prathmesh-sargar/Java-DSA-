

public class FiboFromula {
    public static void main(String[] args) {
        
        System.out.println(fiboFromula(77));
    }

    static int fiboFromula(int n ){
        
        // int ans = (int)(Math.pow(((1+ Math.sqrt(n))/2), n) /Math.sqrt(n));
        // return ans;

        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        double psi = (1 - sqrt5) / 2;

        // Use Binet's formula to compute the nth Fibonacci number
        int ans = (int)((Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5);

        return ans;
    }
}
