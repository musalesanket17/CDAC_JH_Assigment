class Pattern11{
	
	public static void main(String args[]){
	int res =64;
	 for(int i=1;i<=5;i++){
		 
		 for(int j=1;j<=i;j++){
			 System.out.print((char)(res+i));
			 
		 }
		 System.out.println();
	}
	}
}
/*
A
BB
CCC
DDDD
EEEEE
*/