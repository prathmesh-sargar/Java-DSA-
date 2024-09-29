import java.util.ArrayList;

public class ArrayListQ {
    
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<=10;i++){
            list.add(i);
        }

    //    System.out.println( list.size());
    //    System.out.println(list);

       int[] arr = {1,2,3,4,5,46};

       for(int num : arr){
        System.out.print(num + " ");
       }
       System.out.println();
       int maxval =   MaxElement(arr);


       System.out.println("maximum value  : "+maxval);
      
    //   swapingElement(arr , 2,5);

     int maxval_In_Range =  maxElementInRange(arr ,1,5);
     System.out.print(" maxval_In_range 1 to 5 : "+maxval_In_Range);
     
     ReverseArray(arr);
        
    }


    static void swapingElement(int[] arr ,int index1 , int index2){


             // swaping concept 
             int temp = arr[index1];
             arr[index1] = arr[index2];
             arr[index2] = temp;
   
         System.out.println();    
        for(int num : arr){
            System.out.print(num + " ");
           }
    }



    static int MaxElement(int[] arr){

        int maxval = 0;
        for( int i=0 ;i <arr.length;i++){
            if(arr[i]> maxval)
            {
                maxval = arr[i];
            }
        }
        return maxval;
    }


    // find max val in given range of element 
    static int maxElementInRange(int[] arr, int start , int end){

        int maxval =0;
        for( int i=start;i<=end;i++){

            if(arr[i] > maxval){
            maxval = arr[i];
            }
        }

        return maxval;
    }



     // Reverse given array of element : 
     static void ReverseArray(int[] arr){

        int start =0;
        int end = arr.length-1;

        while(start < end){

            for(int i=start;i<end;i++){

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            start++;
            end--;
        }

        System.out.println();
        for( int num : arr){
            System.out.print(num + " ");
        }

     }

    
}














