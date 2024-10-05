import java.util.Arrays;

public class Sorting_Algorithm {
    
    public static void main(String[] args) {
        
        int[] arr = {5,3,4,1,2};
        System.out.println(arr.length);
        // BubbleSort(arr);
        // Selection_Sort(arr);
        Insertion_Sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void BubbleSort(int[]arr){

        for(int i=0;i<arr.length;i++){

            for(int j=1;j<arr.length-i;j++){
                // int[] arr = {5,4,3,2,1};
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }
    }

    static void Selection_Sort(int[]arr){
        int last = arr.length;

        for(int i=0;i<last;i++){
            // find maximum element in array 
            int minval = i;
            // int[] arr = {5,4,3,2,1};
            for(int j=i+1;j<last;j++){
                if(arr[j]<arr[minval]){
                    minval = j;
                }
            }
            // swaping the elements 
            int temp = arr[i];
            arr[i] =arr[minval];
            arr[minval] = temp;

        }
    }

    static void Insertion_Sort(int[]arr){

        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j>0;j--){

                // smallest element goes at first index 
                if(arr[j]<arr[j-1]){
                     swap(arr, j,j-1);
                }
            }
        }
    }

    static void swap(int[]arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}

