import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		WebDriver driver = new ChromeDriver (); // we need to create object to access methods of a class
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.getTitle();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"))).build().perform(); //build makes the step ready to execute.
		a.contextClick(driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"))).build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hi thug").doubleClick().build().perform();	//double click selects the text	
	}

}
