
public class Abstraction {

	public static void main(String[] args) {
		shape s = new shape(5);  //we can't create object of abstract class directly.
		s.abm1();
		s.abm2();
		s.m2();
	}

	
}

//in abstract Methods and properties are implicitly public or protected.
//interface or abstract class can't be instantiated.
 abstract class area         //abstract class
 {  
	int b;                   //abstract class can have constructor.
    public area(int b)  
    {this.b=b;}
    
    
   abstract public void abm1();     //abstract method can't be private.
   abstract public void abm2();     //all abstract methods should be implemented in the child.
   public void m2()
   {System.out.println("Implemented method in abstract class");  //abstract class can have implemented as well as non implemented method.
   }
 }
 
class shape extends area    //only one abstract class can be inherited.
 {

	public shape(int b) {
		super(b);
	}

	@Override                      //override annotation to implement abstract method.
	public void abm1() {
		System.out.println("Abstract method1 Implemented :"+ b);
		}
	
	public void abm2() {                //Implement abstract method without override.
		System.out.println("Abstract method2 Implemented :"+ b);
		
	}

}
