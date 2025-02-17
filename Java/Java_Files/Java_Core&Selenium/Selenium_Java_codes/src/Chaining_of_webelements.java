



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chaining_of_webelements {

	@Test
	public void PageShop()

	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Shop")).click();
		WebElement Card = driver.findElement(By.xpath("//app-card[4]"));      //xpath of the 4th card containing "Blackberry" 
		String MobileName = Card.findElement(By.xpath("div/div/h4[@class=\"card-title\"]/a")).getText();    //start directly from div not "/div" 
		System.out.println(MobileName);
	    
	    
		

	}

}
