

public class BinarySearch01 {

    public static void main(String[] args) {

        int[] arr = {2,6,12,15,16,18,21,25};
        int target = 14;
        System.out.println(CeilingOf_number(arr, target));
        System.out.println(FloorOf_number(arr,target));

    }

    static int CeilingOf_number(int[] arr, int target){
        // the smallest number which is greather then or equal to target 

        int start =0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(target > arr[mid]){

                 start = mid +1;
            }
            else if( target < arr[mid]){
                end = mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }


    
   static int FloorOf_number(int[]arr , int target){
    // The greatest number which is smaller then or equal to target number :    target >= the number of arr[i]

    int start = 0;
    int end = arr.length-1;

    while(start<=end){

        int mid = start +(end-start)/2;

        if(target >arr[mid]){
            start = mid+1;
        }
        else if(target <arr[mid]){
            end = mid-1;
        }
        else{
            return arr[mid];
        }
    }
    return arr[end];
   }
}

