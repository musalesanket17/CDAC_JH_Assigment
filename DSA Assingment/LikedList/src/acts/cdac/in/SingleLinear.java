package acts.cdac.in;
import java.util.Scanner;

enum singlell{
	 EXIT,ADDFIRST,ADDLAST,ADDATSPECIFICPOSITION,DELETFIRST,DELETELAST,DELETALL,DELETATSPECIFICPOSITION,PRINTALL;
};
public class SingleLinear {
  private static Scanner sc = new Scanner(System.in);
	  static class Node{
		  private int data;
		  private Node next;
		public Node(int data) {
			
			this.data = data;
//			this.next = next;
		}
		public Node() {
			this(0);
		}
		  
	  }
	  
	  private Node head;

	public SingleLinear() {
		
		this.head = null;
	}
	  
	public void print() {
		
		 Node trav = head;
		 while(trav != null) {
			 
			  System.out.println(trav.data);
			  trav = trav.next;
		 }
		 
	}
	
	public void addNodeAtLast(int el) {
		
		 Node nn = new Node(el);

		 Node trav = head;
		 
		 if(head != null) { 
		 
		 while(trav.next != null) {
			 trav = trav.next;
		 }
		 
		    trav.next = nn;
		 }
		 else {
			 head = nn;
		 }
//			 System.out.println("LikedList is Empty!!");
		 
	}
	
	public void addNodeAtFirst(int el) {
		 
		  Node nn = new Node(el);
		  nn.next = head;
		  head = nn;
	}
	public void addNodeAtSpecificPos(int el ,int position) {
		
		Node nn = new Node(el);
		Node trav = head;
		
		if(head != null) {
		
		for(int i=1;i<position-1;i++) {
			if(trav.next == null) {
				break;
			}
			trav = trav.next;
		}
		nn.next = trav.next;
		trav.next = nn;
		}
		else if(head == null || position <=1) {
			 addNodeAtFirst(el);
		}
	}
 
	 public void deletFirstNode() {
		 
		  if(head == null)
			  throw new RuntimeException("OOPS LinkedList is already Empty !!");
		  else 
			  head = head.next;
		  
			  
	 }
	 
	 public  void deletAll() {
		  
		    head = null;
	 }
	
	 public void deletlast() {
		  Node trav = head;

		 if(trav.next == null) {
			 head=null;
		 }
		 else {
		  
		  while(trav.next.next != null) {
			   
			  trav = trav.next;
		  }
		  trav.next = null;
		 }
	 }
	 
	 public void deleteAtSpecificPosition(int position) {
		 
		  
		  Node trav = head ; 
		  
		  for(int i=1;i<=position-2;i++) {
			   trav = trav.next;

		  }
//		   System.out.println(trav.data);
		  trav.next = trav.next.next;

		  
	 }
	public static singlell  menuList() {
		System.out.println("0.EXIT");
		System.out.println("1.ADDFIRST");
		System.out.println("2.ADDLAST");
		System.out.println("3.ADDATSPECIFICPOSITION");
		System.out.println("4.DELETFIRST");
		System.out.println("5.DELETELAST");
		System.out.println("6.DELETALL");
		System.out.println("7.DELETATSPECIFICPOSITION");
		System.out.println("8.PRINTALL");
		System.out.print("Enter Choice : ");
		singlell[] s = singlell.values();
		
		return s[sc.nextInt()];
	}
	
	@SuppressWarnings("incomplete-switch")
	public void Switch() {
		// EXIT,,ADDLAST,ADDATSPECIFICPOSITION,DELETFIRST,DELETELAST,DELETATSPECIFICPOSITION;
		SingleLinear sl = new SingleLinear();

		singlell s = null;
		while( (s=menuList())!=singlell.EXIT ) { 
			switch(s) {
			case ADDFIRST:
				System.out.println("Enter New Node data At First : ");
				sl.addNodeAtFirst(sc.nextInt());
				break;
			case ADDLAST:
				System.out.println("Enter New Node data At Last : ");
				sl.addNodeAtLast(sc.nextInt());
				break;
			case ADDATSPECIFICPOSITION:
				System.out.println("Give Position which you want to add data : ");
				int pos = sc.nextInt();
				System.out.println("Enter New data to Add Specific Position : ");
				sl.addNodeAtSpecificPos(sc.nextInt(), pos);
				break;
			case DELETFIRST:try {
					sl.deletFirstNode();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case  DELETELAST:sl.deletlast();
				break;
			case DELETALL:sl.deletAll();
				break;
			case DELETATSPECIFICPOSITION:
				System.out.println("Enter Which position you want ot delete : ");
				sl.deleteAtSpecificPosition(sc.nextInt());
				break;
			case PRINTALL :sl.print();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		SingleLinear s = new SingleLinear();
		s.Switch();
		
		
		
	}
}
