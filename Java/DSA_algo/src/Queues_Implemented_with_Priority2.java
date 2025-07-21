import java.util.Stack;

public class Queues_Implemented_with_Priority2 {  //Linear data structure (FIFO)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queuePriority2 q = new queuePriority2(7);
		q.enQueue(1114);
		q.enQueue(0);   //number of entries should be less than equal to size variable.
		q.enQueue(1);
		q.enQueue(-22);
		q.enQueue(333);
		q.enQueue(14);
		q.enQueue(-24);
		q.print_queue();
		System.out.println("+++");
		q.deQueue();
		q.print_queue();
		System.out.println("+++");
		

	}

}


class queuePriority2{
	int size;
	int[] arr;
	int rear = -1;
	int m;
	int k;
	public queuePriority2(int size)
	{
		this.size=size;
		this.arr = new int[size];
	}
	public void enQueue(int val)
	{  Stack<Integer> s = new Stack<Integer>(); 

		if (rear ==-1)
		{rear++;    //rear should point to latest index and can't be more than size variable.
		arr[rear] = val;
		k = rear;}
	else
	{  
		while(k>=0 && arr[k]>val)
		{
			arr[k+1]=arr[k];
			k--;
		}
		arr[k+1]=val;
		rear=rear+1;
		k=rear;
	
	}
		
	}
	
	public int deQueue()
	{
		m = arr[0];
		for(int i =0; i< rear;i++)
		{
			arr[i] = arr[i+1];
		}
		rear--;
		return m;   //deQueue returns first inserted element.
	}
	public void print_queue()
	{
		for(int i =0; i<=rear; i++)
		{
			System.out.println(arr[i]);
		}
	}
}