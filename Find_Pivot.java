public class Find_Pivot {
    
    public static void main(String[] args) {
        
        int[] arr = {3,4,5,6,7,0,1,2};
        int pivotIndex = findPivot(arr);
        System.out.println(" index is : "+pivotIndex);
        System.out.println("Index element is : "+arr[pivotIndex]);
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


}

