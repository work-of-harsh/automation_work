
public class Queues {  //Linear data structure (FIFO)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q = new queue(5);
		q.enQueue(0);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.print_queue();
		System.out.println("+++");
		System.out.println(q.deQueue());
		System.out.println("+++");
		q.print_queue();
		q.enQueue(55);
		System.out.println("+++");
		q.print_queue();
		q.deQueue();
		q.deQueue();
		System.out.println("+++");
		q.print_queue();
		

	}

}


class queue{
	int size;
	int[] arr;
	int rear = -1;
	int m;
	public queue(int size)
	{
		this.size=size;
		this.arr = new int[size];
	}
	public void enQueue(int val)
	{   rear++;    //rear should point to latest index and can't be more than size variable.
		arr[rear] = val;
		
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