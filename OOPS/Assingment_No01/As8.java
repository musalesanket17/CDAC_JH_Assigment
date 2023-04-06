
/*
   9.Write a program to convert state of Byte instance into byte, short, int. long, float and double.
*/

class As8{

    public static void main(String args[]){
           byte a=10;
           Byte b =new Byte(a);
            
           short s = b.shortValue();
           System.out.println(s);

          int i = b.intValue();
          System.out.println(i);

          float f = b.floatValue();
          System.out.println(f);
          
          double d = b.doubleValue();
          System.out.println(d);



          
    }
}