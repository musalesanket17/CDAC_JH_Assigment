package booklist.in;

public class BookArray {
	static  Book[] bArray = new Book[3];
	 
	   public static  void AddIntoAarray(Book b){
		     
		  
		   
		   if(b!=null ) {
		   for(int i=0;i<bArray.length;i++) {
			    
			   bArray[i] = b;
		    }
		   }
		    
	   }
	   
	  
}
