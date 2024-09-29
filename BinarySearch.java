public class BinarySearch {

    public static void main(String[] args) {
        
        // int[] arr = {2,12,23,45,56,67,78,89};
        int[]arr = {1000,987,756,654,534,423,100,34,12};
        int target = 100;
        // System.out.println(target+" is present at "+Binarysearch(arr,target));
        System.out.println(OrderAgnostic_BS(arr,target));

        

    }


    static int Binarysearch(int[] arr, int target){

        // pointing two points 
        int start =0;
        int end = arr.length-1;

        while (start <=end) { 
            
            // calculate mid 
            int mid = start + (end-start)/2;

            if(target >arr[mid]){
                start = mid+1;
            }
            else if(target <arr[mid]){
                end = mid-1;
            }
            else{
                return mid;  // this is exicuted if element is found 
            }
        }

        return -1;  // if element is not present in given array then this will exicuted ok 
    }

    static int OrderAgnostic_BS(int[] arr ,int target){

        int start =0;
        int end = arr.length-1;
        while(start <= end){
            // find mid 
            int mid = start +(end-start)/2;

            if(arr[mid]== target){
                return arr[mid];
            }
            boolean IsAsecending = arr[start] < arr[end];

            if(IsAsecending){

                 if(target > arr[mid]){
                    start = mid+1;
                 }
                 else if(target <arr[mid]){
                    end = mid-1;
                 }
            }
            else{

                if(target < arr[mid]){
                    start = mid+1;
                 }
                 else if(target > arr[mid]){
                    end = mid-1;
                 }
            }


        } 
      
        
        return -1;
    }



}
