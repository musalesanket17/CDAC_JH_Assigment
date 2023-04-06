/*
9.Write a program to convert state of Byte instance into byte, short, int. long, float and double.
*/
class As10 {

  public static void main(String args[]) {
    byte a = 10;
    Byte b = Byte.valueOf(a);

    byte s = b;
    System.out.println(s);

    double d = b.doubleValue();
    System.out.println(d);

    float f = b.floatValue();
    System.out.println(f);

    int i = b.intValue();
    System.out.println(i);

    long l = b.longValue();
    System.out.println(l);
  }
}
