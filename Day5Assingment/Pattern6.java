import java.util.Scanner;
class Pattern6{

   public static void main(String args[]){
   
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number : ");
	 int num = sc.nextInt();
      for(int i=num;i>=1;i--){
		  
		   for(int j=1;j<=i;j++){
			   System.out.print("*");
		   }
		   System.out.println();
	  }
	  for(int i=2;i<=num;i++){
		  
		  for(int j=1;j<=i;j++){
			  System.out.print("*");
		  }
		  System.out.println();
	  }
    
   }
}
/*
  5432112345;
*/