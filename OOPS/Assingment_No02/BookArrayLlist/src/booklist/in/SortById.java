package booklist.in;

import java.util.Comparator;

public class SortById implements Comparator<Book> {

	 @Override
	public int compare(Book b1, Book b2) {
		
		 return b1.getId() - b2.getId();
		
	}
	 
}
