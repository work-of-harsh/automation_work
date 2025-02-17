
public class Interface {

	public static void main(String[] args) {
		circle c = new circle(5);
		c.sum();
		c.area();
		c.area2();
 
	}}

//interface can have access modifier (public) for methods and properties.
interface game                     //interface class cannot have constructors.
{  
   public void area();       //interface class can have only non implemented methods.
   public void area2();  
}

interface shape2                             
{ public void sum();    }    


class circle implements game,shape2         //all parent interface methods should be implemented in the child.  //multiple inheritance supported in interface.
{   
	int i;
	public  circle (int i)
	{this.i =i;}

	@Override
	public void sum() {
		System.out.println("Implemented sum method in shape2 class :" +i ); 
		
	}

	@Override
	public void area() {
		System.out.println("Implemented area  method in game class :"+i ); 
		
	}

	
	public void area2() {                  //Implement interface method without override.
		System.out.println("Implemented area2 method in game class :"+i ); 
		

	}

}
