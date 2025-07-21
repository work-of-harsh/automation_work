import java.util.Stack;

public class queueStack {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	int a;
	
	public void enQueue(int val)
	{
		stack1.push(val);
	}
	public int deQueue()
	{
		while(!stack1.empty())
		{
			stack2.push(stack1.peek());
			stack1.pop();
		}
	a=stack2.peek();
	stack2.pop();
	while(!stack2.empty())
	{
		stack1.push(stack2.peek());
		stack2.pop();
	}
	System.out.println("deQueue executed: element remves is "+ a);
	return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueStack q= new queueStack();
		q.enQueue(0);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		System.out.println(q.stack1);
		q.deQueue();
		System.out.println(q.stack1);
		}

}
