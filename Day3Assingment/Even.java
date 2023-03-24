/*

 Qestion : Identify Even number With using ternary oprator ? 
 
*/
import java.util.Scanner;

class Even{

  public static void main(String args[]){
  
   
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Number till you want all Even Number: ");
	 int j = sc.nextInt();
	 
	 for(int i=0;i<=j;i++){
		 
		 int ans=i%2==0 ? i : 0 ;
		 if(ans !=0) System.out.println("Even No is : "+ans); 
		 
		 
		 
	 }
   
  }  
 
}