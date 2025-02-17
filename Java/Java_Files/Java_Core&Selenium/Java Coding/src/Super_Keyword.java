
public class Super_Keyword {

	public static void main(String[] args) {                 //super can be used to call parent class variable, method and constructor.
		cars c= new cars();
		c.chi_m();
		System.out.println(c.a);     //prints a = 88
		c.display();

	}
  
}


  class vehicle
{    int a = 55;
	   public vehicle() 
	   {   System.out.println("parent constructor");         }
	   
	   public void par_m()
	   {System.out.println("parent method"); }
	   
	   public void bmw()
	   {System.out.println("parent bmw");}
	   
}
  
  class cars extends vehicle
{    int a =88;
	   public cars() 
	   {   super();               //super can be used to call and provide parameter to parent class constructor.
		   System.out.println("child constructor");         }
	   
	   public void chi_m()
	   {System.out.println("child method");        // super to call parent class variable.
	     System.out.println(super.a);               //will print parent class a =55; super works only when a is class variable in both parent and child.
	   }
	   
	   public void bmw()
	   {System.out.println("child bmw");}
	   
	   public void display()           // super to call parent class method.
	   {  bmw();                      //child class bmw
	      super.bmw();                //parent class bmw
	   }
	   
	   
}