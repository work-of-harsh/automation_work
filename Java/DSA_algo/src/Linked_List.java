import org.w3c.dom.Node;

public class Linked_List {
//linked list is a liner Data Structure which is collection of nodes, each node contains a data value and a pointer(reference) to next node.
	
	class Node {                      //class within a class (inner class) , this is node class.
		
		int val;
		Node next;        //next is used for reference.  
		
		public Node(int val) {
			this.val =val;
		}
		
	}
	static Node head = null;  
	Node tail = null;
	public void addNodeatEnd(int val) {
		Node newNode = new Node(val);    
		if (head == null)         //creation of first node
		{
			head = newNode;         //this head will be permanently fixed.
			tail = newNode;         //head and tail same for first node
		}
		else                             //will keep updating tail.
		{
			tail.next= newNode;          //upgrading old tail reference to new node.
			newNode.next = null;         //upgrading new tail reference to null.  
			tail = newNode;              //upgrading new tail  to newNode.
		}
	}
	
	public void printLinkedList(Node headNode) {
		Node current = headNode;
		while(current !=null)
		{
			System.out.println(current.val);
			current = current.next;
		}
		
		
	}
	public void del_node_by_value(int value)
	{ //System.out.println("LinkedList after the remove");	   
	   while(head.val==value)
		{
		head=head.next;
		return;
		}
	    Node current = head;
		while(current != null)
		{
	     if(current.next.val== value && current.next.next!=null)
	    {
	    current.next = current.next.next;  //step to remove the next node.
	    return;
	   
	    }
	    else if(current.next.val== value && current.next.next==null)
	    {
	    
	    current.next=null;
	    return;
	    }
	    else
	    {current = current.next;
	    }
		}
  }

	
	public void del_even_valued_nodes(Node headNode)
	{
		Node current = headNode;
		while(current !=null)
		{
			if(current.val%2==0)
			{
				del_node_by_value(current.val);
			}
		current=current.next;
		}
		System.out.println("Deleted even valued nodes");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List l = new Linked_List();
		l.addNodeatEnd(21);
		l.addNodeatEnd(11);
		l.addNodeatEnd(20);
		l.addNodeatEnd(33);
		l.addNodeatEnd(40);
		l.addNodeatEnd(45);
		l.printLinkedList(head);     //we can directly call head because it is static.
		l.del_even_valued_nodes(head);
		l.printLinkedList(head);

	}

}
