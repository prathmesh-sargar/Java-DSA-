public class LinearSearch {

    public static void main(String[] args) {

        // int[] arr = {45,23,56,76,34,67};
        // int target = 100;
      
        // System.out.println(Search(arr, target));
        
        // String str = "Prathmesh";
        // char ch = 's';

        // System.out.println(Search_character(str, ch));

        // System.out.println(" max val : "+maxval(arr)); 


        int[][]Arr2D ={

            {12,34,56,6},
            {98,4,3},
            {89,65,35,41,83},
            {9,90}
        };
        System.out.println(Arr2D);
        // System.out.println(SearchIn_2D(Arr2D,90));

        System.out.println(Integer.MIN_VALUE);  //  -2147483648
      
        System.out.println(Integer.MAX_VALUE);  //   2147483647

        

    }


    
    // finding targeted element in given array 
    static boolean Search(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
            {
                return true;
            }
        }
        return false;
    }


    // Searching character in given String : 
    static boolean Search_character(String str , char ch){

        if(str.length() ==0){
            return false;
        }

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }


    // find maximum element in given array of list 
    static int maxval(int[] arr){

        if(arr.length ==0){
            return -1;
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++){

           if(arr[i] < max){
              max = arr[i];
           }
        }
        return max;
    }



    // Search element in 2D arrays : 
    static boolean SearchIn_2D(int[][]Arr2D , int target){
        for( int row=0;row<Arr2D.length;row++){
            for(int col =0;col<Arr2D[row].length;col++){
                if(Arr2D[row][col] == target){
                    return true;
                }
            }
        }
        return false;
    }




}