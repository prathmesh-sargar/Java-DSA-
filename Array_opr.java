import java.util.Scanner;

public class Array_opr {

    public static void main(String[] args) {

        // given 3X3 matrix
        // opeations perform on that ......
        // (+ , - , / , X )

        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] arr2 = {
                { 10, 11, 12 },
                { 13, 14, 15 },
                { 16, 17, 18 }
        };
        int[][] NewMatrix = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.print("Which operation you Perform ( + , - , / , X ) :  ");
        char opr = scan.next().charAt(0);

        ArraySum(arr1, arr2, NewMatrix, opr);

    }

    static void ArraySum(int[][] arr1, int[][] arr2, int[][] NewMatrix, char opr) {

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1.length; j++) {
                switch (opr) {
                    case '+':
                        NewMatrix[i][j] = arr1[i][j] + arr2[i][j];
                        System.out.print(NewMatrix[i][j] + "  ");
                        break;
                    case 'X':
                        NewMatrix[i][j] = arr1[i][j] * arr2[i][j];
                        System.out.print(NewMatrix[i][j] + "  ");

                        break;
                    case '/':
                        NewMatrix[i][j] = arr1[i][j] / arr2[i][j];
                        System.out.print(NewMatrix[i][j] + "  ");
                        break;
                    case '-':
                        NewMatrix[i][j] = arr1[i][j] - arr2[i][j];
                        System.out.print(NewMatrix[i][j] + "  ");
                        break;

                    default:
                        System.out.println("Invailed opr ");
                        break;
                }

            }
            System.out.println();
        }
    }

}
