
public class LinkedList_Reverse {    //Node class is already defined in another class.
	static Node head = null;  //head of list
	Node tail = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_Reverse k = new LinkedList_Reverse();
		k.addnode(0);
		k.addnode(1);
		k.addnode(2);
		k.addnode(3);
		k.printlist(head);
		k.reverse_list(head);

	}
	
	public void printlist(Node headnode)
	{Node current = headnode;
	while(current!=null) {
		System.out.println(current.val);
		current=current.next;
	}
		
		
	}
	//method to insert new node.
	public void addnode(int val)	
	{   Node newnode  = new Node(val);
		if(head == null)
		{
			head= newnode;
			tail=newnode;
		}
		else {tail.next=newnode;
		     newnode.next=null;   //this step is non needed as this.next=null is present in Node class. This step means current nodes next reference is set to null, it doesn't points to any other node.
		     tail=newnode;
			
		}
			
	}
	public void reverse_list(Node headnode)
	{
		Node current = headnode;
		Node prevNode = null;
		Node nextNode = null;

		while(current!=null)
		{  nextNode = current.next;    //nextNode helps current to move forward.
		   current.next=prevNode;      //changing direction of current pointer to prevNode.
		   prevNode = current;         //prevNode becomes current node.
		   current = nextNode;

	    }
		System.out.println("Printing reversed Node");
		printlist(prevNode);      //After completing the while loop last node was assigned to prevNode. nextNode and temp became null 
		
	}
	


}


