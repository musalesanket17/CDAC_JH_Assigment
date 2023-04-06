/*
Q.Write a program to perform below operations on Boolean type to convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
*/
import java.lang.reflect.Array;
class As5{

/*
   public static void main(String args[]){
      // a. boolean value into String 
        boolean b = true;
        String str = Boolean.toString(b);
        System.out.println(b);
   }

 
   public static void main(String args[]){
// b. boolean value into Boolean instance.
       
        Boolean b = new Boolean(true);
        boolean c = b.booleanValue();
        System.out.println(c);
   }  
  
     public static void main(String args[]){
        // c. String value into boolean value
        boolean arr[] = {true,false,true};

        for(int i=0;i<arr.length;i++){
            
            boolean b=Array.getBoolean(arr,i);
            System.out.println(b);
        }
     }
    

  */
  public static void main(String args[]){
      // d. String value into Boolean instance.
      boolean arr[]={true,true,false};

      for(int i=0;i<arr.length;i++){

           Boolean b = new Boolean(Array.getBoolean(arr,i));
           System.out.println(b);
      }
      
  }

}