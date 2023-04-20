package booklist.in;

import java.util.Comparator;

public class SortByPrice implements Comparator<Book> {

     @Override
    public int compare(Book o1, Book o2) {
    	 
    	 return (int) (o1.getPrice() - o2.getPrice());
     }
     
}

