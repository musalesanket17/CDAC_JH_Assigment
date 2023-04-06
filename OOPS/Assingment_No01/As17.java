/*
 
  17. Write a program to convert state of 
  Integer instance into byte, short, int, long, float and double.
 
*/

class As17 {

  public static void main(String args[]) {
    Integer i = Integer.valueOf(20);
    Byte b = i.byteValue();
    Float f = i.floatValue();
    Long l = i.longValue();
    Double d = i.doubleValue();

    System.out.println(i);
    System.out.println(b);
    System.out.println(f);
    System.out.println(l);
    System.out.println(d);
  }
}
