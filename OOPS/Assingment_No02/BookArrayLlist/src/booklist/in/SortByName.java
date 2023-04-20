package booklist.in;

import java.util.Comparator;

public class SortByName implements Comparator<Book>{

  
	public int compare(Book o1, Book o2) {
	 
		     return o1.getAuthor().compareTo(o2.getAuthor()) ;
   	}
}
 
