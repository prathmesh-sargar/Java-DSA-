
import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        // System.out.println("Input 2D arrays : ");

        // decleration of arrays : 
        // int [][] arr = new int[3][3];
        // for(int i=0;i<arr.length;i++){

        //     for( int j=0;j<arr.length;j++){
        //         arr[i][j] = in.nextInt();
        //     }
        // }

        // System.out.println("Print 2D arrays : ");
        // Print2D_Arrays(arr);

        // PrintBy_forEach(arr);

        MultiColumnArr();

        in.close();



    }


    static void Print2D_Arrays(int[][]arr){

        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }



    static void PrintBy_forEach(int [][] arr){

        System.out.println("Print by for Each loop : ");
        for( int[] num : arr){
            // System.out.println(num);
            System.out.println(Arrays.toString(num));
        }

    }


    // Print multi Column Array : 
    static void MultiColumnArr(){

        int [][] arr = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }
    
    
}


