import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hands_on_1 {

	public static void main(String[] args) throws InterruptedException {              //throws InterruptedException is added for Thread.sleep(1000); 
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		WebDriver driver = new ChromeDriver (); // we need to create object to access methods of a class
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.getTitle(); 
		System.out.println(driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("Thug");
		driver.findElement(By.name("inputPassword")).sendKeys("Life");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);             
		System.out.println(driver.findElement(By.xpath("(//form)[2]")).getText());
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("p.error")).getText(), "* Incorrect username or password"); //verifying text
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[@class=\"reset-pwd-btn\"]")).click();
		String password =  getPassword(driver);  //sending driver as argument and getting back password
		System.out.println(password);
		driver.findElement(By.cssSelector(".go-to-login-btn")).click(); 
		Thread.sleep(2000); 
		driver.findElement(By.id("inputUsername")).sendKeys("Thug");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
		driver.close();
		
		
		
		

	}
	
	public static String getPassword(WebDriver driver)     //connecting "driver" of main code with "driver" of method in getPassword(WebDriver driver) 
	
	{	String Full = driver.findElement(By.tagName("p")).getText();	  //getting text from web site and extracting password using split
		System.out.println(Full);
		//Full.split("'");
		String pass = Full.split("'")[1];
		System.out.println(pass);
		return pass;  //returning password
	
	}

}
