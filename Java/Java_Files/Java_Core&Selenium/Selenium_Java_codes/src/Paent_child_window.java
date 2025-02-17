import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paent_child_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

		Iterator<String>it = windows.iterator();        //Iterators in Java are used to retrieve elements one by one. It is a universal iterator as we can apply it to any Collection object.

		String parentId = it.next();    //first time moves to "parentid"

		String childId = it.next();			//second time moves to "childid"

		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		driver.findElement(By.cssSelector(".im-para.red")).getText();

		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

		driver.switchTo().window(parentId);

		driver.findElement(By.id("username")).sendKeys(emailId);



	}

}
