/*
 
 15. Write a program to perform below operations on int type to get:
  a. The number of bits used to represent a integer value 
  b. The number of bytes used to represent a integer value 
  c. The minimum value a integer 
  d. The maximum value a integer

*/

class As15 {

  public static void main(String args[]) {
    int by = Integer.BYTES;
    System.out.println(by);

    int bi = Integer.BYTES * 8;
    System.out.println(bi);

    int min = Integer.MIN_VALUE;
    System.out.println(min);

    int max = Integer.MAX_VALUE;
    System.out.println(max);
  }
}
