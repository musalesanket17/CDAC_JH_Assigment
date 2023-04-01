class Pattern9{
	
	public static void main(String args[]){
	int res =64;
	 for(int i=1;i<=5;i++){
		 
		 for(int j=1;j<=i;j++){
			 System.out.print((char)(res+j));
			 
		 }
		 System.out.println();
	}
	}
}
/*
A
AB
ABC
ABCD
ABCDE

*/