import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueInBuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new ArrayDeque<Integer>();  //Queue is interface,ArrayDeque is class to implement its method.
		//https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
      q.add(0);
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      
      System.out.println(q);
      System.out.println(q.peek());
      q.remove();//FIFO also returns the FI value.
      q.remove(4);//Remove by value
      q.add(5);
      q.add(6);
      q.add(7);
      System.out.println(q);
      reverse_queue(q);
      Queue<Integer> q1 = new PriorityQueue<Integer>(); // inserting with sorting integer or string.
      q1.add(2);
      q1.add(-2);
      q1.add(1);
      q1.add(0);
      q1.add(12);
      q1.add(5);
      q1.add(2);
      System.out.println("Printing q1");
      System.out.println(q1);
      
	}

	public static void reverse_queue(Queue<Integer> q)
	{Stack<Integer> stack1 = new Stack<Integer>();
    while(!q.isEmpty())
    {
  	  stack1.push(q.remove());
    }
    while(!stack1.isEmpty())
    {
  	  q.add(stack1.peek());
  	  stack1.pop();
    }
    System.out.println(q +" is the reversed Queue");
		
	}
}
