import java.util.Stack;

public class Stacks {  //Linear data structure (LIFO)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		System.out.println(stack1);
		reverse_stack(stack1);
		insert_at_index_stack(stack1,4,55);
		//find_min__stack(stack1);    //this function empties stack1.
		remove_by_value__stack(stack1,55);
		sort__stack(stack1);

	}
public static void reverse_stack(Stack<Integer> s)
{
	Stack<Integer> stack2 = new Stack<Integer>();
	Stack<Integer> stack3 = new Stack<Integer>();
	while(!s.empty())     //while(s.empty() == false)
	{
		stack2.push(s.peek());
		s.pop();
	}
	while(!stack2.empty())
	{
		stack3.push(stack2.peek());
		stack2.pop();
	}
	while(!stack3.empty())
	{
		s.push(stack3.peek());
		stack3.pop();
	}
	System.out.println(s  + " Stack is reversed");
	}
public static void insert_at_index_stack(Stack<Integer> s,Integer index, Integer val)
{   int c =0;
	Stack<Integer> stack2 = new Stack<Integer>();
	while(!s.empty())     
	{
		stack2.push(s.peek());
		s.pop();
	}
	while(!stack2.empty())
	{
		if(c==index)
		{
			s.push(val);
		}
	 s.push(stack2.peek());
	 stack2.pop();
	 c++;
	}
	if(index==s.size())
	{
		s.push(val);
	}
	
	
	System.out.println(s +" " + val + " Inserted at Index " + index);
	}
public static void find_min__stack(Stack<Integer> s)
{
	Stack<Integer> stack2 = new Stack<Integer>();
	stack2.push(s.peek());
	s.pop();
	while(!s.empty())     
	{
		if(s.peek()<stack2.peek())
		{
			stack2.push(s.peek());
		}
		s.pop();
	}

	System.out.println(stack2.peek() +" Is the min element");
	}
public static void remove_by_value__stack(Stack<Integer> s, Integer val)
{
	Stack<Integer> stack2 = new Stack<Integer>();

	while(!s.empty())     
	{
		if(s.peek()!=val)
		{
			stack2.push(s.peek());
		}
		s.pop();
	}
	while(!stack2.empty())     
	{
		
		
			s.push(stack2.peek());
		
		stack2.pop();
	}
	System.out.println(s +" Element " +val + " removed");
}
public static void sort__stack(Stack<Integer> s)
{   int a;
    int b;
	Stack<Integer> stack3 = new Stack<Integer>();
    stack3.push(s.peek());
    s.pop();
	while(!s.empty())     
	{
		if(!stack3.empty() && s.peek()<stack3.peek())
		{
			a=s.peek();
			s.pop();
			
			{while(!stack3.empty() && a<stack3.peek())   //empty condition should be first.
			{s.push(stack3.peek());
			stack3.pop();}
			stack3.push(a);
		}}
		else
		{
			stack3.push(s.peek());
			s.pop();
		}
	
	}
	System.out.println(stack3+ " Sorted in ascending order");
}
}
