	
public class Recurssion {

	static Integer[] a = {1,2,3,4,5,6};
	public static void main(String[] args) {
		
		int s= Get_Sum(a.length-1);
		System.out.println("Sum is: " + s);
		
		int s1= factorial(5);
		System.out.println("Factorial is: "+ s1);
		
		int s2= Fibanocci(7);
		System.out.println("Fibanocci term is: "+ s2);
		
		}

	//Recurssion for sum of elements in array
	public static Integer Get_Sum(int n)
	{
		if(n==0)
		return a[n];
		
		return a[n] + Get_Sum(n-1);
	}
	
	//Recurssion for factorial
	public static Integer factorial(int n)
	{
		if(n==0)
		return 1;
		
		return n* factorial(n-1);
		}
	
	
	//Recurssion for Fibanocci
		public static Integer Fibanocci(int n)
		{
			if(n==0 || n==1)         //base solution
			return n;
			
			
			return Fibanocci(n-1) +  Fibanocci(n-2) ;
		}

}






