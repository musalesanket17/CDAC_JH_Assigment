/*
Qestion : Elibigility For Upcoming Election?
*/

import java.util.Scanner;

class Election{
 
  public static void main(String args[]){
   
     Scanner sc = new Scanner(System.in);
	 System.out.println("If You are Indian then type IN Otherwise type NO : ");
	 String nationality= sc.next();
	 System.out.println("Enter You Age : ");
	 int age = sc.nextInt();
	 String in ="IN";
	 
	 int result = nationality.equals(in) && age >= 18 ? 1 : 0 ; 
	 if(result == 1) System.out.println("You are Eligible for Upcoming Voting :)");
	 else System.out.println("You are Not Eligible for Upcoming Voting !! ");
	 
  }
  
}