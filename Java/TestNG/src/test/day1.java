package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last in module no 1 because of @AfterTest present in day1 file");
		
	}
	@Test       //@Test used to define test cases
	public void Demo()
	{
		System.out.println("hello");//automation
		Assert.assertTrue(true);
	}
	@AfterSuite
	
	public void afSyite()
	{
		System.out.println("I am will execte after the suite beacsue @AfterSuite of present in day1 file ");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}



}
