import java.util.Scanner;

public class ArrayExamples {
    
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);


        // int[] arr = {1,2,3,4,5};
        System.out.print("Input arrays element : ");
        for(int i=0;i<arr.length;i++){
              arr[i] = in.nextInt();
        }
          PrintArray(arr);

         in.close();
    }

    // Printing arrays of elements 
    static void  PrintArray(int[] arr){
       for( int num : arr){
        System.out.print(num+ " ");
       }
    }


}

