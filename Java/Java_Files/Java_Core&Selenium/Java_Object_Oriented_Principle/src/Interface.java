
public class Interface {
// interface is class with empty bodies.
	public static void main(String[] args) {
		circle c = new circle(5);
		c.sum();
		c.area();
		c.area2();
		game c1 = new circle(5);  //c1 has access of only game methods.
	}}

//interface  have access modifier by default public for methods and properties.
//in java static methods can't be overridden.
interface game                     //interface class cannot have constructors.
{   int var =0;               //variables created in interface class are by default public static final.
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
