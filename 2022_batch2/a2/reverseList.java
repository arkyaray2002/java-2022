package a2;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		next = null;
	}
}


class Create_LL 
{	
	private Node head;
	Create_LL()
	{
		head = null;
	}
	
	void display()
	{
		Node n = head;
		if(n == null)
		{
			System.out.println("Linked List is Empty");
		}
		else
		{
			while(n != null)
			{
				System.out.print(n.data + "-> ");
				n = n.next;
			}
			System.out.println();
		}
	}
	
	void add_start(int val)
	{
		Node new_node = new Node(val);
		new_node.next = head;
		head = new_node;
	}
	
	void add_end(int val)
	{
		Node new_node = new Node(val);
		if(head == null)
		{
			head = new_node;
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = new_node;
		}
	}
	
	
	
	void delete_start()
	{
		Node n = head;
		if(n == null)
		{
			System.out.println("Linked List is Empty!");
		}
		else
		{
			head = n.next;
		}
	}
	void delete_end()
	{
		Node n = head;
		if(n== null)
		{
			System.out.println("Linked List is Empty!");
		}
		else
		{
			while(n.next != null)
			{
				n = n.next;
			}
			n = null;
		}
	}
	
	void reverse()
	{
		Node temp1 = null, temp2 = null;
		if(head == null)
		{
			System.out.println("Linked List is Empty!");
		}
		else
		{
			while(head != null)
			{
				temp2 = head.next;
				head.next = temp1;
				temp1 = head;
				head = temp2;
			}
			head = temp1;
			
		}
		
	}	
}
public class reverseList 
{
	public static void main(String args[]) 
	{		
		Create_LL ll1 = new Create_LL();
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 to add element to the front.\nEnter 2 to add element to the back.\nEnter 3 to delete to the front.\nEnter 4 to delete to the back.\nEnter 5 to display.\nEnter 6 to print the list in reverse.");
			int ch= sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the element to add");
				ll1.add_start(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter the element to add");
				ll1.add_end(sc.nextInt());
				break;
			case 3:
				ll1.delete_start();
				System.out.println("Element deleted");
				break;
			case 4:
				ll1.delete_end();
				System.out.println("Element deleted");
				break;
			case 5:
				System.out.println("\n--------------\n");
				ll1.display();
				break;
			case 6:
				System.out.println("\nYour list in reverse:");
				ll1.reverse();
				System.out.println("\n--------------\n");
				ll1.display();
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			System.out.println("Continue? 1=yes, 0=no");
			if(sc.nextInt() != 1)
			{
				System.out.println("Code ended");
				break;
			}
			
		}
		
		
	}

}
