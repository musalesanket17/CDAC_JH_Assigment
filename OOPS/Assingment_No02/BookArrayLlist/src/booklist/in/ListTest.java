package booklist.in;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ListTest {
 
	static List<Book> list = new ArrayList<>();
	 
	public static void AddIntoArrayList(Book b){
	     System.out.println("HI Iinside AddBOOk");
//         b.toString();
		 list.add(b);
		 
	}
	
	 public static void PrintArrayList(Comparator<Book> comparator) {
	     System.out.println("HI Iinside Print ");
		 list.sort(comparator);
	     list.forEach(el->System.out.println(el.toString()));
   }
	 
	public static Book FindBook(int id) {
		 
		 for(Book el:list) {
			  
			 if(el.getId() == id) {
				  
				 return el;
			 }
		 }
		return null;
	}
	
	public static void RemoveBook(int id) {
		Book book = new Book();
		book.setId(id);
		  if(list.contains(book)) {
			   
			   int index = list.indexOf(book);
			   list.remove(index);
		  }
	}
	
}
