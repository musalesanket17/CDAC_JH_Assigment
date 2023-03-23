/*

Qestion : Compare Num1 & Num2 
          if Num1 is > then n1+n2 
		  else n1-n2;

*/

import java.util.Scanner;

class Compare{

   public static void main(String args[]){
    
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Num1: ");
	   int n1 = sc.nextInt();
	   System.out.println("Enter Num2: ");
	   int n2=sc.nextInt();
	   
	   int ans = n1>n2?(n1+n2):(n1-n2);
	   System.out.println("Ans = "+ans);
   }
}