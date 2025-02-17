import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {              //throws InterruptedException is added for Thread.sleep(1000); 
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		WebDriver driver = new ChromeDriver (); // we need to create object to access methods of a class
		driver.get("http://spicejet.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.getTitle(); 
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); 
		

		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		

}
}
