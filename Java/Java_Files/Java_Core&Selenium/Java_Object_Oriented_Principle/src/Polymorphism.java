
public class Polymorphism extends tp {

	public static void main(String[] args) {
		
		
		tp met1 = new tp();
		System.out.println(rate);   //when we write in the main block if we use "rate" directly not as "met1.rate", we have to declare rate variable as static in tp1.
		System.out.println(met1.rate_of_int());
		//class variable "rate" override.
		System.out.println(rate);
		//over loading
		met1.overloading(1,3);
		met1.overloading(1.5,2.5);
		met1.overloading("Hi"," Thug");  
		//accessing method of class "Polymorphism".
		Polymorphism poly = new Polymorphism();
		poly.tp2();
	}
	
	public void tp2()
	{  
		rate_of_int();     //we can use method name directly, without declaring it static in parent class, as this is not main block.
	    System.out.println(rate);
	    int rate2 = tp.rate;
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

class tp1
{ static int rate = 5;    //by declaring static, we can directly use "rate" variable in child class without object. Same way we can declare static methods too.
public int rate_of_int()
{return 10;}
//over loading: Same method working differently with different parameter.
public void overloading(int a, int b )
{   
	System.out.println(a+b);
	}
public void overloading(double a, double b )
{   
	System.out.println(a+b);
	}
public void overloading(String a, String b )
{   
	System.out.println(a+b);
	}
}