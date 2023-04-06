/*
 
11.Accept character from command line and perform below operations. Here you can use charAt() method to extract character:
a. Check whether entered character is letter or digit. If it is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? If it is in lowercase then convert it into upper case and print it well as its code point. If it is in uppercase

*/

class As12{

    public static void main(String args[]){

          String s = "ass";
          char ch = s.charAt(0);
        //   System.out.println(ch);
         char c='b';
          if((int )ch >= 65 && (int )ch <= 90){
              c=ch.toLowerCase();
              System.out.println(ch + " is a Upperase but we convert into the lower case & ASCCI value is :"+(int)ch);
          }
          else if((int )ch >= 97 && (int )ch <= 122){
             c=ch.toUpperCase();
            System.out.println(ch + " is a Lowefcase but we convert into the Upper case & ASCCI value is :"+(int)ch);

          }
          else if((int )ch >= 48 && (int )ch <= 57){
            System.out.println(ch + " is a Upperase but we convert into the lower case & ASCCI value is :"+(int)ch);
          
          }
          else   System.out.println("Plz Enter Valid char");

    }
    
}