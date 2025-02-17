import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Is_enabled_use {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		WebDriver driver = new ChromeDriver (); // we need to create object to access methods of a class
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.getTitle();
		driver.manage().window().maximize();
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));  //getting contents of style locator

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))   //checking contents of style loctor.

		{

		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}

	}

}
