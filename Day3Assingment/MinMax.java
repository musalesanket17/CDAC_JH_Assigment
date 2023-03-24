/*

Qestion : Take 3 Variable and find min & max ?

*/
import java.util.Scanner;

 
 class MinMax{
  
   
    public static void main(String args[]){
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Num1 : ");
	  int a=sc.nextInt();
	  System.out.println("Enter Num2 : ");
	  int b=sc.nextInt();
	  System.out.println("Enter Num3 : ");
	  int c=sc.nextInt();
	  
	  System.out.println("If you want to Find Minimum Number then Enter One :");
	  System.out.println("If you want to Find Maximum Number then Enter Two :");
	  int option= sc.nextInt();
	  
	  switch(option){
		  
		  case 1:
		     int ans = a<b && a<c ? a : b<c ? b : c ;
			 System.out.println("Minimum Number is : " +ans);
		         break;
		  case 2:
		     int ans1=a>b && a>c ? a : b>c ? b : c ;
			 System.out.println("Maximum Number is : " +ans1);
		         break;
		  default: System.out.println("Plz Enter valid option :)");
		  
	  }
	  
	    
	}
 
  
 }