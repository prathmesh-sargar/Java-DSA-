import java.util.Arrays;

public class Solve_Recursion {

    public static void main(String[] args) {

        // print3(5);
        // System.out.println(factorial(5));
        // printALL(5);
        // print5(3);
        // System.out.println(sumOfAll(5));

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10 };
        System.out.println(Arrays.toString(arr));
        // reverseArray(arr, 0, arr.length-1);
        // reverseArrayByRecursion(arr, 0, arr.length-1);
        // reverseArrayBy_singlePointer(arr, 0);
        System.out.println(Arrays.toString(arr));

        String str = "madam";
        // System.out.println(PalindromeStr(str));
        // System.out.println(PalindromeStr_By_Recursion(str, 0, str.length()-1));
        fibonachi_series_of_number(5);

        System.out.println("\n"+nth_fibonachi(5));
    }

    // print numbters from n to 1
    static int print1(int n) {

        // base condition
        if (n < 1) {
            return n;
        }
        System.out.print(n + " ");
        return print1(n - 1);
    }

    // print numbters from 1 to n
    static int print2(int n) {

        // base condition
        if (n >= 6) {
            return n;
        }
        System.out.print(n + " ");
        return print2(n + 1);
    }

    // print numbters from 1 to n
    static int print3(int n) {

        // base condition
        if (n >= 6) {
            return n;
        }
        System.out.print(n + " ");
        return print3(n + 1);
    }

    static int factorial(int n) {

        if (n <= 1)
            return n;
        else
            return n * factorial(n - 1);
    }

    static void printALL(int n) {
        if (n <= 1) {
            return;
        }
        printALL(n - 1);
        System.out.print(n + " ");
        printALL(n - 1);

    }

    static void print5(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        print5(n - 1);
        System.out.println(n);
    }

    static int sumOfAll(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sumOfAll(n - 1);
    }

    // Reverse array by using iteractive approch ....
    static void reverseArray(int arr[], int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Reverse array by using Recursion :
    static void reverseArrayByRecursion(int[] arr, int s, int e) {

        if (s >= e)
            return;

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        reverseArrayByRecursion(arr, s + 1, e - 1);
    }

    // Reverse Array using single pointer only :
    static void reverseArrayBy_singlePointer(int[] arr, int s) {

        if (s >= arr.length / 2)
            return;

        int temp = arr[s];
        arr[s] = arr[arr.length - 1 - s];
        arr[arr.length - 1 - s] = temp;
        reverseArrayBy_singlePointer(arr, s + 1);
    }

    static boolean PalindromeStr(String str) {
        int s = 0;
        int e = str.length() - 1;

        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }
        s++;
        e--;
        return true;

    }

    // palindrome String By Recursion
    static boolean PalindromeStr_By_Recursion(String str, int s, int e) {
        if (s >= e) {
            return true;
        }
        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }
        return PalindromeStr_By_Recursion(str, s + 1, e - 1);

    }

    static void fibonachi_series_of_number(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i <=n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }


    static int nth_fibonachi(int n ){
    
        if(n <=1){
            return 1;
        }
        return nth_fibonachi(n-1)+nth_fibonachi(n-2);
    }
}
