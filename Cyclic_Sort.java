
import java.util.Arrays;

public class Cyclic_Sort{

    public static void main(String[] args) {
        
        int[] arr = {5,1,4,2,3};
        cyclic_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic_Sort(int[] arr){

        int i=0;
        while(i < arr.length){

            int correct = arr[i]-1;   // this is correct position of element 

            if(arr[i] != arr[correct]){
                swap( arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[]arr , int start ,int end){

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}