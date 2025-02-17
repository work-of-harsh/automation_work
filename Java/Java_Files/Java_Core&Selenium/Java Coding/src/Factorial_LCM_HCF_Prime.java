import java.util.ArrayList;
import java.util.Collections;

public class Factorial_LCM_HCF_Prime {

	public static void main(String[] args) {
		//factorial
		int a=5;
		int m =1;
		while (a!=0)
		{m = m*a;
		a=a-1;}
		System.out.println("factorial is : "+m);
		//HCF
		int a1=30;
		int a2 =15;
		ArrayList<Integer> m1 = new ArrayList<Integer>();
		ArrayList<Integer> m2 = new ArrayList<Integer>();
		ArrayList<Integer> m3 = new ArrayList<Integer>();
		for (int i =1; i <= a1;i++)
		{ if (a1%i==0)
		{m1.add(i);}
		}
		System.out.println(m1);
		for (int i =1; i <= a1;i++)
		{ if (a2%i==0)
		{m2.add(i);}
		}
		System.out.println(m2);
		
	    for(int i : m1)
	    { if(m2.contains(i))
	    {m3.add(i);}
	    }
	    Collections.sort(m3);     //sort and reverse in collections class.
	    System.out.println(m3);
	    Collections.reverse(m3);
	    System.out.println("Hcf is: "+ m3.get(0));
	    
	  
	    
	    //LCM
	   
	    int a3 = 3;
	    int a4 = 8;
	    int a5 = 0;
	    int k =1;
	    while(k!=0)
	    {a5 = k*a3;
	     if(a5%a4 ==0)
	     {k=0;
	     break;}
	     k = k+1;
	    }
	    System.out.println("Lcm is: "+ a5);
	    
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
	

}
