import java.util.Scanner;

class Main{

  Scanner sc=new Scanner(System.in);
  
  int arr[] = new int[5];
  
  void Input(){
	  
	  for(int i=0;i<arr.length;i++){
		  
		   System.out.println("plz Enter Arr "+i+" element : " );
		   arr[i]=sc.nextInt();
	  }
  }
	  
	void Find_Max(){
		int max=-2147483648 ;
		for(int i=0;i<arr.length;i++){
			
		
			if(arr[i]>max ){
				max =arr[i];
			}
			}
			System.out.println("Max Number From Arr is "+max);
		}
		
	void Find_min(){
		
		int min=2147483647;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Min Number From Arr is "+min);
	}
		
	}
	
	
	
  
  
  




class Min_Max{

   public static void main(String args[]){
	   
	   Main m = new Main();
	   m.Input();
	   m.Find_Max();
	   m.Find_min();
	    
	   
   }

}