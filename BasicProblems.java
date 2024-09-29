public class BasicProblems {
    
    public static void main(String[] args) {
        
        int arr[] = { 12,345678,345,2,6,7896};

        System.out.println("Event numbers Digits : "+SearchNumbers(arr));

    }
      // find no of no's that have even digits 
      static int SearchNumbers(int[]arr){
          int count= 0;

          for(int i=0;i<arr.length;i++){
            if(evenDigit(arr[i])){
                count++;
            }
          }
          return count;
      }

      
      static boolean evenDigit(int num ) {

          int  Digit_ofNumber = digitcal(num);  // count val 

          if(Digit_ofNumber % 2 ==0){
            return true;
          }
          return false;
      }


      static int digitcal(int num){   // return  count val 

        int count =0;
        while(num>0){
            num= num/10;

            count++;
        }
        return count;
      }


}
