import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vegetable_Shopping_Cart_Method2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		String text = "Harsh";
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] veg = {"Beetroot","Cucumber"};
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		ArrayList<String> prodtext = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		int j =0;
		List itemsNeededList = Arrays.asList(veg);   //contains can only be used in ArrayList.
		for (int i = 0; i<products.size();i++)
		{
			String[] a= products.get(i).getText().split("-");
			
			if (itemsNeededList.contains(a[0].trim()))   //splits give "Cucumber "
			{    
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				b.add(a[0]);
				System.out.println(b);
				j++;
				if (j== veg.length)   //we use .length for array and .size() for arraylist.
				{
					break;
				}
			}
		}
	
		

}}
