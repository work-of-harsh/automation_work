
public class Polymorphism extends tp {

	public static void main(String[] args) {
		
		
		tp met1 = new tp();
		System.out.println(rate);   //when we write in the main block if we use "rate" directly not as "met1.rate", we have to declare rate variable as static in tp1.
		System.out.println(met1.rate_of_int());
		//class variable "rate" override.
		System.out.println(rate);
		//over loading
		met1.overloading(1,3);
		met1.overloading(11);
		met1.overloading(1.5,2.5);
		met1.overloading("Hi"," Thug");  
		//accessing method of class "Polymorphism".
		Polymorphism poly = new Polymorphism();
		poly.tp2();
		poly.overloading("lr", " di");   //overriding an overloading example method.
	}
	
	public void tp2()
	{  
		rate_of_int();     //we can use method name directly, without declaring it static in parent class, as class Polymorphism extends tp.
	    System.out.println(rate);
	    int rate2 = rate;
	}
	public void overloading(String a, String b )
	{   
		System.out.println(a+b+ " hi");
		}
	
    
	

}

class tp extends tp1
{
//method overriding.
public int rate_of_int()
{   System.out.println("method overriding");
    //class variable "rate" override.
    rate = 10;
	return 6;}
}
//a class can have multiple constructor(with no or different data types) and behave accordingly.
class tp1
{ static int rate = 5;    //by declaring static, we can directly use "rate" variable in child class without object. Same way we can declare static methods too.
public int rate_of_int()
{return 10;}
//over loading: Same method working differently with different parameter. either different number of argument or different data type of argument.
public void overloading(int a, int b )
{   
	System.out.println(a+b);
	}
public void overloading(int a)
{   
	System.out.println(a);
	}
public void overloading(double a, double b )       //double 15-16 decimal point presecion. float 7
{   
	System.out.println(a+b);
	}
public void overloading(String a, String b )
{   
	System.out.println(a+b);
	}
}