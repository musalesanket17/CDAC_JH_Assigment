import java.util.Scanner;

class Lcm{
 
   public static void main(String args[]){
   
   
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Num1: ");
	   int n1= sc.nextInt();
	   System.out.println("Enter Num2: ");
	   int n2 = sc.nextInt();
	   
	   int l=n1>n2?n1:n2;
	   int llcm,i =0;
	   
	   for(i=l;i<=n1*n2;i+=l){
		   
		   if(i%n1==0 && i%n2==0){
			 
			   break;
		   }
	    
        }  
		  llcm = i;
          System.out.println("LCM of "+n1+" & "+n2 +" is "+ llcm);		
  
   }
}