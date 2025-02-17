import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		WebDriver driver = new ChromeDriver (); // we need to create object to access methods of a class
		String monthNumber = "6";

		String date = "15";

		String year = "2027";

		String[] expectedList = {monthNumber,date,year};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();

		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();  //in the calander, month no starts from 0.

		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();														//Integer.parseInt converts into integer.

		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		for(int i =0; i<actualList.size();i++)

		{

		System.out.println(actualList.get(i).getAttribute("value")); //text not present so we use value.

		Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);    

		}

		driver.close();
	}

}
