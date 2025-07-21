import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factorial_LCM_HCF_Prime {

	public static void main(String[] args) {
		

		int a=13;
		int b =5;
		int m=1;
		//factorial
		for (int i=a;i>0;i--)
		{
			m *= i;
			
		}
		System.out.println("factorial "+m);
		
		
		//hcf
		List<Integer> f1= factors(a);
		List<Integer> f2= factors(b);
		List<Integer> hcf = new ArrayList<Integer>();
		
		for (int i : f1)
		{
			if(f2.contains(i))
			{
				hcf.add(i);
			}
		}
		
		System.out.println("hcf "+hcf.get(hcf.size()-1));
		
		
		//lcm
		m=1;
		while (true)
		{
		if(a*++m%b==0)
		{
			System.out.println("lcm " + a*m);
			break;
			
		}
			
		}
		
	   
	
	
	
	
	
	
	
	    
	    //Prime no
	    
	    int a6 = 3;           //1 is not a prime no as prime no have 2 factors.
	    ArrayList<Integer> m4 = new ArrayList<Integer>();
	    for (int i =1; i < a6;i++)
	    {if(a6%i==0)
	    {m4.add(i);}
	    }
	    
	    if(m4.size()==1)   //1 is in this list
	    {
	    	System.out.println(a6 + " No is Prime");
	    }
	    else
	    {
	    	System.out.println(a6 + " No is not Prime");
	    }
	}
	
	public static List<Integer> factors(int in)
	{
		List<Integer> li= new ArrayList<Integer>();
		for(int i =1;i<=in;i++)
		{
			if(in%i==0)
			{
				li.add(i);
			}
		}
		
		return li;
	}
}
