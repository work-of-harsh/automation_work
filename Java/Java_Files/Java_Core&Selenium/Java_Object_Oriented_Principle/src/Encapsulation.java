import org.testng.annotations.Test;

public class Encapsulation {
    
	
@Test
public void enc1()

{   enc obj = new enc();
	System.out.println(obj.c); 
    //System.out.println(obj.a);      a is private
     obj.met2();
     //obj.met1();                    met1() is private
    
}
}

class enc 
{
	private int a = 6;              //access modifiers: private allows access only at class level. protected allows access to class, subclass and other classes of same package. public allows access to different packages too.If nothing is provided, then access is for same class and other classes of same package. 
	int c = 10;
	private void met1()
	  {  int b =5;
	  System.out.println(b);
	  System.out.println("Only class method can access private variables and peivate methods");
	  
	  }

	public void met2()
	  {  int b =11;
	  System.out.println(b);
	  met1();
	  a=66;    //private variable updated.
	  System.out.println(a);
	  
	  }

}