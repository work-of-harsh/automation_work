
public class Super_Keyword {
   static int a= 10;
	public static void main(String[] args) {                 //super can be used to call parent class variable, method and constructor.
		cars c= new cars();
		c.chi_m();
		System.out.println(c.a);     //prints a = 88
		System.out.println(a);     //prints a = 10
		c.display();
          ///super keyword can't be used in main body directly.
	}
  
}


  class vehicle
{    int a = 55;

	   public vehicle() 
	   {   
		   System.out.println("parent constructor");         }
	   
	   public void par_m()
	   {System.out.println("parent method"); }
	   
	   public void bmw()
	   {   int a =20;
	       int sum = this.a+a; //this and super has scope at current class level only, not inside the methods of the class.
		   System.out.println("parent bmw with this.a "+sum);}  
	   
}
  
  class cars extends vehicle
{    int a =88;
	   public cars() 
	   {   super();               //super invokes and can also provide parameter to parent class constructor.  // super should be the first line in constructor if required.
		   System.out.println("child constructor");         }
	   
	   public void chi_m()
	   {System.out.println("child method");        // super to call immediate parent class variable.
	     System.out.println(super.a);               //will print immediate parent class a =55; super works only when a is class variable in both parent and child.
	   }
	   
	   public void bmw()
	   {System.out.println("child bmw");}
	   
	   public void display()           // super to call parent class method.
	   {  bmw();                      //child class bmw
	      super.bmw();                //parent class bmw
	   }
	   
	   
}