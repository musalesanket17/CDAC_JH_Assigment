/*
 10.Write a program to perform below operations on char type to get:
  a. The number of bits used to represent a char value 
  b. The number of bytes used to represent a char value 
  c. The minimum value a char 
  d. The maximum value a char 

*/

class As11{

    public static void main(String args[]){

        int c=Character.BYTES;
        System.out.println(c);

        int b=Character.BYTES*8;
        System.out.println(b);
     
        int min=Character.MIN_VALUE;
        System.out.println(min);

        int max=Character.MAX_VALUE;
        System.out.println(max);
        


    }
}
