

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class time_synchroniz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //implicit wait
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));   //explict wait
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
		//Thread.sleep(5000L);
	
	driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
   
	
		
		
		
	}

}
