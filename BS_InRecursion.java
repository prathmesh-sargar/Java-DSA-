
public class BS_InRecursion {
    public static void main(String[] args) {

        int[] arr= {1,2,12,23,34,45,55,56,57,67,78,89,98};
        int target =  89;
        int ans =  recursion_find_num(arr, target, 0,arr.length-1);
        System.out.println(ans);
        
    }

    static int recursion_find_num(int[]arr , int target, int s ,int e){
    
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;

        if(arr[mid] ==target){
            return mid;
        }

        if(target >arr[mid]){
            return recursion_find_num(arr, target,mid+1,e);
        }
        return recursion_find_num(arr, target, s, mid-1) ;
    }
}

