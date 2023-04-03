class Pattern18{
   
    public static void main(String args[]){
		int d=64;
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print((char)(d+i)+" ");
		}
		System.out.println();
	}
}
}