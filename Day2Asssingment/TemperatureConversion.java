import java.util.*;
/*
  Fahrenheit to Celsius = (?°F − 32) × 5/9 
  Celsius to Fahrenheit = (?°C × 9/5) + 32
*/

class TemperatureConversion{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("IF You want to Convert Fahrenheit to Celsius Then press 1 :");
		System.out.println("If You want to convert Celsius to Fahrenheit Then press 2 :");
		int option = sc.nextInt() ;
		
		
		
		switch(option){
			
			case 1: System.out.println("Enter Fahrenheit : ");
			        float Fahr = sc.nextFloat();
					float Fahrenheit = (Fahr -32) * 5/9;
					System.out.println(Fahr + " Fahrenheit to CelsiusConversion is : "+ Fahrenheit+"^C");
					break;
					
			case 2: System.out.println("Enter Celsius : ");
			        float Cels = sc.nextFloat();
					float Celsius = (Cels * 9/5) + 32 ;
					System.out.println(Cels+" Celsius to Fahrenheit Conversion is : "+ Celsius+"^F");
					break;
					
			default: System.out.println("Plz Enter valid Choice!!");
			
		}
			
		
		
	
		
	}
	
}
