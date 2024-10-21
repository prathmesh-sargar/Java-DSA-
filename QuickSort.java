import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args) {
        
        
        int[] arr = { 5, 4, 3, 2, 1,10,101,12,34,1,34};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[]arr ,int low ,int high){

        if(low <high){

            int pivot = partition(arr, low ,high);  // find pivot element : 
            quicksort(arr, low, pivot -1);
            quicksort(arr, pivot+1, high);
        }
    }

    static int partition(int[]arr ,int low ,int high){

        int pivot = arr[high];   // Choose the last element as the pivot
        int i = low - 1;         // Pointer for elements smaller than the pivot

        for(int j=low;j<high;j++){    // Iterate over the array

            if(arr[j] <pivot){       // If current element is smaller than the pivot
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place the pivot in correct place : 
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;      // Return the pivot index ...
    }
}

