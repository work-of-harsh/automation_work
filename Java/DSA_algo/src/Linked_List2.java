
public class Linked_List2 {
	static Node head = null;  //head of list
	Node tail = null;
	static Node newNode2;



	public static void main(String[] args ) {

		Linked_List2  k = new Linked_List2 ();
		k.addnode(0);
		k.addnode(1);
		k.addnode(2);
		k.addnode(3);
		k.printlist(head);
		k.element_presence(head);
		k.addNode_at_beginning(head);   //print is inside this function.
		k.addNode_at_index(1);
		k.del_last_node(head);
		k.printlist(head);
		k.del_first_node(head);
		k.printlist(head);
		k.del_node_at_index(1);
		k.printlist(head);
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
		
		public void printlist(Node headnode)
		{Node current = headnode;
		while(current!=null) {
			System.out.println(current.val);
			current=current.next;
		}
			
		}
		public boolean element_presence(Node headnode)
		{Node current = headnode;
		while(current!=null) {
			if(current.val==3)
				return true;
				
			current=current.next;
				}
		return false; }
       public void addNode_at_beginning(Node headnode)
		{Node newNode1 = new Node(-1);
		
		newNode1.next=headnode;
		System.out.println("New Node added at the beginning");
		while(newNode1!=null) {
			System.out.println(newNode1.val);
			newNode1=newNode1.next;
		}
			}
       
       public void addNode_at_index(int index)             //this code doesn't work for adding at beginning.
		{  newNode2 = new Node(-2);                 //newNode2 is declared as class node variable.
		if(index==1)
		{
			newNode2.next=head;
			System.out.println("New Node added at the index :"+ index + " with reference to head node");
			System.out.println("Here newNode1 is removed and newNode2 is added and it points to head,newNode1 points to null");
			printlist(newNode2);
			return;
		}
		
		Node current = head;      //head node is assigned to current
		for(int i =1; i< index-1;i++)
		{if(current.next!=null)       //written to avoid exception.
			current = current.next;
		}
		Node nextNode = current.next;       
		current.next=newNode2;
		newNode2.next=nextNode;
		System.out.println("New Node added at the index :"+ index + " with reference to head node");
		printlist(head);
		}
     
       public void del_last_node(Node headnode)
		{
		Node current = headnode;
		System.out.println("Removing last node with reference to head node");
		while(current.next.next!=null) {
			current = current.next;
			
		}current.next=null;
			}
       
       public void del_first_node(Node headnode)
		{
		head=head.next;
		System.out.println("Removing first node with reference to head node");}

       public void del_node_at_index(int index)
		{		if(index==1)
		       {
			    head=head.next;
			    System.out.println("Node deleted at the index :"+ index + " with reference to head node");
			    return;         //return can be used to skip further execution.
		             }
   		Node current = head;      
   		for(int i =1; i< index-1;i++)
		{if(current.next!=null)      
			current = current.next;
		}
   		Node nextnode= current.next.next;
   		current.next=nextnode;
   		System.out.println("Node deleted at the index :"+ index + " with reference to head node");
		}

}
//Node class creates new node through constructor
class Node{
	int val;
	Node next;
	public Node(int val) {
		this.val= val;
		this.next=null;         //this step is not needed as next is by default initialized.
	}
}


