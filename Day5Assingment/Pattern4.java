import java.util.Scanner ;
class Pattern4{
 
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number : ");
	 int num = sc.nextInt();
      for(int i=num;i>=1;i--){
		  
		  for(int j=1;j<=num-i;j++){
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++){
			  System.out.print("*");
		  }
		  System.out.println();
	  }
  }

}