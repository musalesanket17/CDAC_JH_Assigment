package acts.cdac.in;

import java.util.Scanner;

public class TrySLL {
	
	  private static Scanner sc = new Scanner(System.in);


	  static class Node{
		  
		 
		private int data ;
		  @SuppressWarnings("unused")
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next=null;
		}
		  
	  }
	  
	  private Node head;


	public TrySLL() {
		
		this.head = null;
	}
	
	
	public int  menu() {
		System.out.println();
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
		return sc.nextInt();
	}
	public void deleteAtSpecificPosition(int position) {
		
		if(head == null) {
			throw new RuntimeException(" List is alredy Empty !! ");
		}
		else {
			Node trav = head;
			for(int i=1;i<=position-2;i++) {
				 
				trav = trav.next;
				
			}
			trav.next = trav.next.next ;
		}
		
	}
	
	
	public void deletelast() {
		 
		if(head == null) {
			throw new RuntimeException(" List is alredy Empty !! ");
		}
		else {
			
			Node trav  = head ;
			
			
			while(trav.next.next != null ) {
				 trav = trav.next;
			}
			trav.next = null;
		}
		 
	}
	public void deleteFirst() {
		 
		if(head == null) {
			throw new RuntimeException(" List is alredy Empty !! ");
		}
		else {
			
			head = head.next;
		}
	}
	
	public void addAtSpecificPosition(int position , int data ) {
		
		Node nn = new Node(data);
		Node trav = head;
		
		if(head == null ) {
			throw new RuntimeException("This Specific Position is not Available !!");
		}
		else {
		 
			 for(int i=1;i<=position-2;i++) {
				  
				 trav = trav.next;
			 }
			 nn.next = trav.next;
			 trav.next = nn;
			 
			 
		}
	}
	
	
	public void addfirst(int ele) {
		 
		Node nn = new Node(ele);
		
		if(head == null) {
			head = nn;
		}
		else {
			nn.next = head;
			head= nn;
		}
	}
	public void addLast(int data) {
		 Node nn = new Node(data);
		 Node trav = head;
		 if(head == null) {
			 head = nn;
		 }
		 else {
			  
			 while(trav.next != null) {
				  
//				 System.out.println(trav.data);
				 
				 trav = trav.next;
			 }
			 
			 
			 trav.next=nn; 
		 }
	}
	
	public void printAll() {
		 Node trav = head ;
		 
		 if(head == null) {
			 throw new RuntimeException("List is Empty !!!");
		 }
		 else {
			 
			   while( trav != null ) {
				   
				   System.out.print(trav.data+"->");
				   trav = trav.next;
			   }
			   System.out.println("null");
		 }
		
	}
	public void deleteAll() {
		
		
		if(head == null) {
			 throw new RuntimeException("List is Empty !!!");
		 }
		else
			head = null;
		
		 
	}
	public void Switch() {
		TrySLL sl = new TrySLL();
		int choice ;
		while((choice = sl.menu())!=0 ) {
			
			switch(choice) {
			 
			case 1:
				System.out.println("Enter Data for add At First Position : ");
				sl.addfirst(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter Data for add At Last Position : ");
				sl.addLast(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter Data for add At Specific Position , Plz Enter Position : ");
				int pos  = sc.nextInt();
				System.out.println("Enter Data which you want to add : ");
				sl.addAtSpecificPosition(pos, sc.nextInt());
				break;
			case 4:
				try {
					sl.deleteFirst();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage());
					
				}
				break;
			case 5:sl.deletelast();
				break;
			case 6:sl.deleteAll();
				break;
				
			case 7:
				System.out.println("Enter Data for Delete At Specific Position , Plz Enter Position : ");
				sl.deleteAtSpecificPosition(sc.nextInt());
				break;
			case 8:sl.printAll();
				break;

			}
		}
	  
	}
	public static void main(String[] args) {
		
		TrySLL t = new TrySLL();
		t.Switch();
	}
}
