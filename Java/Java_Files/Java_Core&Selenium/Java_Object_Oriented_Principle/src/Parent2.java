
public class Parent2 extends Parent3 {
	int a;     // global or class variable.
	
	public Parent2(int a) {      //default constructor
		super(a);     //super constructor used to provide parameter to parent class.
		this.a = a;    // we can also use a=a;  connecting global variable a with parameter variable a.
		               //In Java, this is a reference variable that refers to the current object on which the method or constructor is being invoked. It can be used to access instance variables and methods of the current object.
		System.out.println("Constructor Parent 2");
	}

	public int add(int k)    //int after public because of return type
	{
		int b = a+k;
		return b;
	}
	
	public int subtract(int k)    
	{
		int b = a-k;
		return b;
	}


}
