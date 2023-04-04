class Pattern23{
	
	public static void main(String args[]){
		
		int d=64;
	for(int i=5;i>=1;i--){
		
		for(int j=1;j<=i;j++){
			System.out.print((char)(d+j)+" ");
		}
		System.out.println();
	}
	
  }
}