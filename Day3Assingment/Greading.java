/*
Qestion : Student Greading System?
*/
import java.util.Scanner;

class Greading{
 
   public static void main(String args[]){
    
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Marks Of English : ");
	   float en = sc.nextInt();
	   System.out.println("Enter Marks Of Math : ");
	   float math = sc.nextInt();
	   System.out.println("Enter Marks Of Java : ");
	   float java = sc.nextInt();
	   System.out.println("Enter Marks Of C++ : ");
	   float cpp = sc.nextInt();
	   System.out.println("Enter Marks Of c# : ");
	   float cSharp = sc.nextInt();
	   float total = en + math + java + cpp + cSharp ;
	   float percentage=( total / 500) * 100;
	   System.out.println("Your Percentage is : "+percentage);
	   
	   if(percentage >= 95) System.out.println("Congratulation You Passed With Distinction!!");
	   else if(percentage >= 85 ) System.out.println("Congratulation You Passed With First Division!!");
	   else if(percentage >= 75 ) System.out.println("Congratulation You Passed With Second Division!!");
	   else if(percentage < 75 ) System.out.println("Congratulation You Passed With Average percentage !!");
	   else if(percentage < 35 ) System.out.println("Oops You Failed this time Best luck for Next Time!!");
   }
}