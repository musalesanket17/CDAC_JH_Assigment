/*
 13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
*/

class As13{

    public static void main(String args[]){
         
         short s=12;
         String str = String.valueOf(s);
         System.out.println(str+1);

         short ss = Short.valueOf(str);
          System.out.println(ss+1);



    }
}