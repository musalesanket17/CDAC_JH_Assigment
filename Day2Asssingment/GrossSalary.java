import java.util.*;

/*
Formula For DA (Dearness Allwoance) = (CPI of 2021 - base CPI)/base CPI * 100
CPI 2021 : 336.51
Base Year CPI (2016) : 216.4 

*/

class GrossSalary{

 
	public static void main(String args[]){
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter Basic Salary : ");
		  double basic_salary=sc.nextDouble() ;
		  
		  System.out.println("Enter Travelling Allowance: ");
		  float TA = sc.nextFloat();
		  
		  System.out.println("Enter Dearness Allowance CPI of Base Year : ");
		  float baseyear_CPI = sc.nextFloat();
		  System.out.println("Enter DearnessAllowance CPI of Currnent 2021 : ");
		  float currentyear_CPI = sc.nextFloat();
		  
		  System.out.println("Enter Petrol Allowace : ");
		  double petrol_Allwonce = sc.nextDouble();
		  
		  float Dearness_Allownace = (currentyear_CPI - baseyear_CPI) / baseyear_CPI *100 ;
		  
		  float tax_Deduction = Dearness_Allownace * 1.76f / 100.00f;
		        tax_Deduction -= Dearness_Allownace ;
				
		  double Gross_Salary  = basic_salary + TA + petrol_Allwonce + Dearness_Allownace - tax_Deduction ;
		  
		  
		  
		  System.out.println("Total Grosssalary of Employ is : "+ Gross_Salary );
		
	}
}
