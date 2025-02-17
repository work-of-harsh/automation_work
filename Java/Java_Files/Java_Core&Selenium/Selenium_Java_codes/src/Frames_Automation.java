import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		WebDriver driver = new ChromeDriver (); // we need to create object to access methods of a class
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.getTitle();
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		//driver.findElement(By.cssSelector("div#draggable")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("div#draggable"));
		WebElement target = driver.findElement(By.cssSelector("div#droppable"));
		a.dragAndDrop(source, target).perform();                         //build().perform() = create chain of actions + execute
		driver.switchTo().defaultContent();    //comes out of frame															
		//whenever going for composite actions (multiple actions) use build().perform(), else only perform().
		driver.close();
	}

}
