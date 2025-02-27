package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day3 {
@BeforeClass				//before executing any methods in the class
public void befoclas()
{
	System.out.println("Before executing any methods in the class");
}   //Method 1 of parameterization using xml file.
	@Parameters({ "URL","APIKey/usrname" })     //indentation is important in Attributes, //@Parameters having dependency from xml file so if we directly run "day3" file, it throws error.
	@Test
	public void WebloginCarLoan(String urlname,String key)    //parameters passed as string , "URL" is automatically assigned to urlname, same with "APIKey/usrname".
	{
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
		
	}
	@BeforeMethod       //execute before every test method in day 3 class
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod      //execute after every test method in day 3 class
	public void afterevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	@AfterClass         //After executing all methods in the class
	public void afteclas()
	{
		System.out.println("After executing all methods in the class");
	}
		
	@Test(groups={"Smoke"})
	public void MobileLogincarLoan()
	{
		//Appium
		System.out.println("Mobilelogincar");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no first beacuse of @BeforeSuite in day3 file");
	}
	@Test(enabled=false)    //TestNG helper attribute to skip this method
	public void MobilesignimcarLoan()
	{
		//Appium
		System.out.println("Mobile SIGIN");
	}
	//Method 2 of parameterization using dataProvider.
	@Test(dataProvider="getData",timeOut=4000)     //will run 3 times for each set of detData    //TestNG helper attribute : timeOut waits for this particular method
	public void MobilesignoutcarLoan(String username,String password)   //each getData set returns two values.
	{
		//Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@Test(dependsOnMethods={"WebloginCarLoan","MobilesignoutcarLoan"})      //TestNG helper attribute : dependsOnMethods executes mentioned methods (WebloginCarLoan","MobilesignoutcarLoan)  first before the below (APIcarLoan) method.
	public void APIcarLoan()
	{    //if dependent methods are not executed, APIcarLoan() execution will be skipped.
		//Rest API automation
		System.out.println("APIlogincar");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combiantion - username password - good credit history= row
		//2nd - username password  - no crdit history
		// 3rd - fraudelent credit history
		Object[][] data= new Object[3][2];   //3-no of rows , 2- no of columns  //no of rows = no of different sets, no of row values(columns) = no of data passing for each set.
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//Columns in the row are nothing but values for that particualar combination(row)
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
		
		
	
		
		
		
		
	}
	
}
