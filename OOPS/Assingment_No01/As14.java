/*
14.Write a program to convert state of Short instance into byte, short, int, long, float and double.

*/

class As14{

    public static void main(String args[]){
         String s1="12";
         Short s = Short.valueOf(s1);
         System.out.println(s);

         byte b = s.byteValue();
         System.out.println(b);

         int i=s.intValue();
         System.out.println(i);

         long l =s.longValue();
         System.out.println(l);

         float f = s.floatValue();
         System.out.println(f);

         double d=s.doubleValue();
         System.out.println(d);





    }
}