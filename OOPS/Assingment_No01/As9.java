/*
  
  10.Write a program to perform below operations on char type to get:
   a. The number of bits used to represent a char value 
   b. The number of bytes used to represent a char value 
   c. The minimum value a char 
   d. The maximum value a char
*/

class As9{


  public static void main(String args[]){
  
   char b= Character.BYTES;
   System.out.println(b);

   int m1 = Character.MIN_VALUE;
   System.out.println(m1);

   int m2 = Character.MAX_VALUE;
   System.out.println(m2);




  }


}