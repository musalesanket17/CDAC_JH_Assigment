package booklist.in;
import java.util.Comparator;
import java.util.Scanner;

 enum bookenum{
	 EXIT,ADDBOOK,FINDBOOK,REMOVEBOOK,PRINTBOOK;
}
public class Program {
  static private Scanner sc = new Scanner(System.in);
  
	
	 public void addNewBook() {
		 
		 Book b = new Book();
		 System.out.println("Plz Entre Book Id : " );
		 b.setId(sc.nextInt());
		 System.out.println("Plz Entre Book Name : " ); 
		 sc.nextLine();
		 b.setName(sc.nextLine());
		 System.out.println("Plz Entre Book Author Name : " );
		 b.setAuthor(sc.nextLine());
		 System.out.println("Plz Enter Book Publisher name : ");
		 b.setPublisher(sc.nextLine());
		 System.out.println("Plz Enter Book Price : ");
		 b.setPrice(sc.nextInt());
		 
		 ListTest.AddIntoArrayList(b);
//		 BookArray.AddIntoAarray(b);
		 
		  
		  
	 }
	 
	 public bookenum menu() {
		  
		  System.out.println("For Exit Press 0 ");
		  System.out.println("For addBook press 1 ");
		  System.out.println("For FindBook press 2 ");
		  System.out.println("For RemoveBook press 3 ");
		  System.out.println("For printBook press 4 ");
		  
		  bookenum[] b = bookenum.values();
		  
		  return b[sc.nextInt()];
 	 }
	
	 public static int SubmenuList() {
		  
		 System.out.println("1.Sort By ID ");
		 System.out.println("2.Sort By Name ");
		 System.out.println("3.Sort By Price ");
		 System.out.println("4.Sort By Book ");
		 return sc.nextInt();
	 }
	 
	 public static void SwitchSubMenu() {
		  int choice;
		  Comparator<Book> comparator =null;
		 while((choice = SubmenuList())!=0) {
			 switch(choice) {
			   
			 case 1: comparator = new SortById();
				 break;
			 case 2:comparator = new SortByName();
				 break;
			 case 3:comparator = new SortByPrice();
				 break;
			 case 4:comparator= new SortByBook();
				 break;
			 }
			 ListTest.PrintArrayList(comparator);
		 }
	}
	 
	 
	  public void Switch() {
		  bookenum b =null;
		  while((b = menu())!= bookenum.EXIT) {

			   switch(b) {
			   case ADDBOOK: this.addNewBook();
				   break;
			   case FINDBOOK:System.out.println("Enter Book ID : ");
			   Book b1 =  ListTest.FindBook(sc.nextInt());
			   if(b1 != null) {
				   
				   System.out.println(b1.toString());
			   }
			   
			   else {
				   System.out.println("Book Not Avialable !");
			   }
			     
				   break; 
			   case REMOVEBOOK:System.out.println("Enter Book ID : ");
			        ListTest.RemoveBook(sc.nextInt());
				   break;
			   case PRINTBOOK:SwitchSubMenu();
//				   ListTest.PrintArrayList();
				   break;
			   }
		  }
	  }
	  
 
	  
	 
	  public static void main(String[] args) {
		  Program p = new Program();
		  p.Switch();
	}
	 
	 
	 
}
