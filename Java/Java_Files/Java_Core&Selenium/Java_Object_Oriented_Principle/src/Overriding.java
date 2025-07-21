
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1= new Child();
		Parent c2= new Child();     //reference parent class
		System.out.println(c1.i);
		System.out.println(c2.i);    //reference parent class
		c1.out();
		c2.out();  
		
	    int m=10;
		int v= 5;
		int sum =0;
		sum = v++  + m ++ + --m + ++v  ;
		System.out.println(sum);
		
		

	}

	
	
}
 class Parent {
	 int i =5;
	 public void out() {
		 System.out.println("Hi");	 }
 }
 
 
 class Child extends Parent {
	 int i =10;   //this does not override. variable override not possible in java, because variable bind time is during compilation
	 public void out() {
		 System.out.println("Thug");}	//this overrides the parent method, because methods bind time is during runtime }
 }
 
 //compilation errors are caught during compilation tile eg: two methods have same name and data type argument.
 //run time errors are caught during run time.