
public class String_cept {

    public static void main(String[] args) {

        stringBuilder();

    }

    static void stringBuilder(){
    
        StringBuilder builder  = new StringBuilder();

        for(int i=0;i<26;i++){
          builder.append( (char) ('a'+i) + "  ");
       }
       System.out.println(builder);
       
   };

    static void print_aToz(){

        for(int i=0;i<26;i++){
            System.out.print((char)('a'+i) + "  ");
        }
    }


    static void print_Demo(){
        String name = "Prathmesh";
        System.out.println(name);
        System.out.println("a" +"b");   //ab 
        System.out.println('a'+3);      // 100
        System.out.println((char)('a'+3));  // d 
        System.out.println('A');  // A 
        System.out.println(12+12);   // 24 
    }


}
