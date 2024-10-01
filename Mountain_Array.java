
public class Mountain_Array {
    
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,10,12,6,5,2,1};
        System.out.println(mountain_Array_Solve(arr));
        
    }

   static int mountain_Array_Solve(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start < end){

            int mid = start +(end-start)/2;

            if(arr[mid] >arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }

        return arr[start] ;       // you can written  arr[end] as well 
    }

    


}



