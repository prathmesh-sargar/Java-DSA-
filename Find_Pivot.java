public class Find_Pivot {
    
    public static void main(String[] args) {
        
        int[] arr = {3,4,5,6,7,0,1,2};
        // int []arr = {0,1,2,3,4,5,6,7};
        int pivotIndex = findPivot(arr);
        System.out.println(" index is : "+pivotIndex);
        
        if(isRotational_Sorted_Array(arr)){
            System.out.println("Not Rotational Sorted Array ");
        }
        else{
            System.out.println("Rotational Sorted array");
        }
    }
    static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start <=end) {
            int mid = start +(end-start)/2;

            // check if the mid element is pivot 
            if(mid <end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid >start && arr[mid] <arr[mid-1]){
                return mid-1;
            }

            // decide which half to choose for Binary Search : 
            if(arr[mid] >=arr[start]){
                // pivot must be in the right half 
                start = mid+1;
            }
            else{
                // pivot is in the left half 
                end = mid-1;
            }



        }
        return -1;  // Pivot is not found array is not rotated 

    }

    
    static boolean isRotational_Sorted_Array(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start<= end){

            int mid = start +(end-start)/2;

            // check if pivot is middle element :
            if(mid <end && arr[mid]>arr[mid+1]){
                return false;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return false;
            }

            // decide which half is choose for Binary Search : 
            if(arr[mid] >=arr[start]){
                start= mid+1;
            }
            else{
                end = mid-1;
            }

        }

        return true;
    }
}

