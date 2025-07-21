import java.util.Stack;

public class BinarySearchTrees {

	
	class Node {
		int value;
		Node left;
		Node right;
		public Node (int value)
		{
			this.value=value;	}
	}
	static Node root;

	
	
	
	public void SortedOrder()      //creating this method so we not need to add root argument repeatedly.
	{
		inorderTraverse(root);
	}
	public void inorderTraverse(Node root)  
	{    Stack<Integer> s = new Stack<Integer>();
		if(root!=null)
		{
			inorderTraverse(root.left);        //prints left roots value
			System.out.println(root.value);  //prints current root value
			inorderTraverse(root.right);     //prints right roots value
		}
	}
	public void insert(int value)    //creating this method so we not need to add root argument repeatedly.
	{
		root = insertNode(root,value);   //initializing the root
	}
	public BinarySearchTrees.Node insertNode(Node root, int value)
	{
		if(root == null)
		{
			root = new Node(value);
			return root;                 // this is return for first run and then recursion call.
		}
		
		if(value>root.value)
		{
			root.right= insertNode(root.right,value);   //this step assigns value to right node
		}
		
		if(value<root.value)   //if we keep if(value<=root.value)  duplicate entries will be possible.
		{
			root.left= insertNode(root.left,value);   //this step assigns value to left node
		}
		return root;    //this is return of main function, root will be fixed.
	}
	
	public void minValue() {
		Node current = root;
		while(current.left!=null)
		{
			current= current.left;
		}
		System.out.println(current.value + " is the minimum value.");
	}
	
	public void maxValue() {
		Node current = root;
		while(current.right!=null)
		{
			current= current.right;
		}
		System.out.println(current.value + " is the maximum value.");
	}
	
	public int getHeight()
	{
		return height(root);
	}
	public int height(Node root)
	{ if(root== null)
		return -1;
	
		return 1+ Math.max(height(root.left), height(root.right));  //"1+" helps in increment. for the last leaf it is "1 + max[-1,-1]" = 0.
	} 
	public boolean search(int val)
	{
		return search_element(root , val);
	}
	public boolean search_element(Node root , int val)
	{  
		if (root== null)
		{System.out.println(val + " Element is not present in the tree");
			return false;}
		else if(val > root.value)
			{search_element(root.right , val);
			}
		else if(val < root.value)
			{search_element(root.left , val);
			 }
		else if(val == root.value)
		    System.out.println(val + " Element is present in the tree");
			return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTrees tree = new BinarySearchTrees();
		tree.insert(0);
		tree.insert(12);
		tree.insert(5);
		tree.insert(1);
		tree.insert(2);
		tree.insert(6);
		tree.insert(-6);
		System.out.println(tree.root.value);
		System.out.println("Sorted Value");
		tree.SortedOrder();
		tree.minValue();
		tree.maxValue();
		System.out.println("Height of tree is " + tree.getHeight());
		tree.search(-6);
		System.out.println(tree.search(-6));
	}

}
