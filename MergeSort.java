import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1,10,101,12,34,155,34};
        mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create temp arrays :
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // copy the data in temp arrays :
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[mid + 1 +i];
        }

        // mearge the two sorted arrays :
        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {

                arr[k] = leftArray[i];
                i++;
               
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;

        }

        // Step 10: Copy any remaining elements from the left half (if any)
        while (i < n1) {
            arr[k] = leftArray[i];
            k++;
            i++;
        }
        // Step 11: Copy any remaining elements from the right half (if any)
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

}

