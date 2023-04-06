/*
8.Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.

*/

class As7{
     
     public static void main(String args[]){
     /*
        byte b1=10;
        String s = Byte.toString(b1);
        System.out.println(s);



          byte b =12;

          Byte b1 = new Byte(b);
          byte out= b1.byteValue();
          System.out.println(out);

          */

          byte b=10;
          String s = Byte.toString(b);
          Byte b1 = new Byte(s);
          System.out.println(b1);



         
     }
}