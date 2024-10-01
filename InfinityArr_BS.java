import java.util.Arrays;

public class InfinityArr_BS {
    
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7,8,9,12,23,34,45,56,67,78};
        int target = 45;
        System.out.println(Arrays.toString(arr));
        System.out.println(ans(arr, target));
        
    }

    static int  ans(int[]arr ,int target){

        int start = 0;
        int end = 1;

        // condition for checking target element is present in range or not ..

        while(target >arr[end]){

            // here we swaping the element   
            // start and end poisition of element 

            int temp = end+1;
            // Double the box value   ( end element )
            end = end +(end -start +1)*2;
           start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }

     static int BinarySearch(int[] arr, int target, int start, int end) {
       
        while(start <end){

            int mid = start +(end-start)/2;

            if(target <arr[mid]){
                end = mid-1;
            }
            else if(target >arr[mid]){
                start = mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }

}
