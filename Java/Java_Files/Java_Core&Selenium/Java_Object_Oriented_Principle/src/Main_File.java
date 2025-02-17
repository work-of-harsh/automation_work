import org.testng.annotations.Test;


public class Main_File extends Parent1 {

	@Test
	public void tc1()
	{   
		dothis();      //run1st() and runlast() will also run present in parent class. no need to create object, directly use because of inheritance.
	}
 
	 
	@Test
	public void tc2()    //for tc2() before and after annotations are ran again in Parent1.
	{
		 
		Parent2 p2 = new Parent2(3);
	
		System.out.println(p2.add(3));
		System.out.println(p2.subtract(3));
		System.out.println(p2.multiply());    //we can access multiply() present in Parent3, from p2 because Parent2 is child for Parent3(inheritance used)
	}

}
