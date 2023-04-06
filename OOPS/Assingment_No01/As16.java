/*
16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.

*/

class As16 {

  public static void main(String args[]) {
    Integer a = Integer.valueOf(20);
    System.out.println(a);

    String str = a.toString();
    System.out.println(str);

    String str2 = String.valueOf("12");
    Integer i2 = Integer.valueOf(str2);
    System.out.println(i2);

    int i3 = 22;
    String b1 = Integer.toBinaryString(i3);
    String b2 = Integer.toHexString(i3);
    String b3 = Integer.toOctalString(i3);

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
  }
}
