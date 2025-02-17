import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

    public class Parent1 {
    
	public void dothis() {
		System.out.println("inheritance successful");

	}
	@BeforeMethod
	public void run1st()
	{
		System.out.println("ran first because of before method");

	}
	
	@AfterMethod
	public void runlast()
	{
		System.out.println("ran last because of after method");

	}
}
