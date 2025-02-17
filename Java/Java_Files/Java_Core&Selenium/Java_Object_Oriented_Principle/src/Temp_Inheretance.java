import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Temp_Inheretance extends Temp1 {

	@Test
	public void tc1()
	{ first();}
	
	@Test
	public void tc2()
	{  Temp2 c = new Temp2(5); 
	  c.add(5);
	  c.sub(5);
	  c.mul(3);
	}
	

}

   class Temp1 {

	public void first()
	{System.out.println("First");
	}
	
	@BeforeMethod
	public void before()
	{  System.out.println("Before");}
	
	@AfterMethod
	public void after()
	{ System.out.println("after");}

}


   class Temp2 extends Temp3 {
    int a;
	public Temp2(int a)
	
	{super(a);
	 this.a=a;
	 System.out.println("Constructor Temp2");
	}
	
	public void add(int k)
	{int b=a+k;
	 System.out.println(b);
	}
	
	
	public void sub(int l) {
		int b = a-l;
		 System.out.println(b);
}
}
   
       class Temp3 {
	   int a;
		public Temp3(int a) {
			 this.a=a;
			 System.out.println("Constructor Temp3");
		}
		
		
		 public void mul(int k)
		 {int b=a*k;
		 System.out.println(b);
		 }
		
	}

