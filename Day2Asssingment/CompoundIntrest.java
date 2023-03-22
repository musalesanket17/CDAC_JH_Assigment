import java.util.*;
/*
 
  Compund Intrest Formula = Amount - principle
                   Amount = principle(1+RateofIntrest/100)^NumberOfYear
				   
				   Principle = 5Cr;
				   No_of_Year =5;
				   Rate_of_Intrest = 10.75%
 
*/

class CompoundIntrest{

   public static void main(String args[]){
              
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principle Amount :");
		double Principle = sc.nextDouble();
		System.out.println("Enter No of Year : ");
		double No_of_Year = sc.nextShort();
		System.out.println("Enter Rate of Intrest ");
		double Rate_of_Intrest = sc.nextFloat();
		
		
		double Amount,Compound_Intrest,per_year,total_year=0 ;
		
		for(int i=1;i<=No_of_Year;i++){
			 
            //Amount =Principle*(1+Rate_of_Intrest/100.00)*i;
		    Compound_Intrest =  Principle * (Math.pow((1 + Rate_of_Intrest / 100), i)) - Principle; ;
			total_year+=Compound_Intrest;
			System.out.println(i+" year Compund intrest on : "+(int)Principle +" is "+(int)Compound_Intrest );
			
		}
		System.out.println("*****************************************************************");
		//System.out.println("Total " + (int)No_of_Year + " year Compund Intrest on "+(int)Principle+ " is " +(int)total_year);
		
		
		 
		
		
		
			  
   }
}