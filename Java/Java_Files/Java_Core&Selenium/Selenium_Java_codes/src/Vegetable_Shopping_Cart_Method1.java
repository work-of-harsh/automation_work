
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vegetable_Shopping_Cart_Method1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		

		WebDriver driver=new ChromeDriver();


		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};





		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		addItems(driver,itemsNeeded);      //connecting driver and itemsNeeded of main class with that of method.

		}

		public static  void addItems(WebDriver driver,String[] itemsNeeded) 			 //receiving driver and itemsNeeded from main class.
																			//static means you can access method without creating object.
		{

		int j=0;

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<products.size();i++)

		{

		//Brocolli - 1 Kg

		//Brocolli,    1 kg

		String[] name=products.get(i).getText().split("-");

		String formattedName=name[0].trim();

		//format it to get actual vegetable name

		//convert array into array list for easy search

		//  check whether name you extracted is present in arrayList or not-

		List itemsNeededList = Arrays.asList(itemsNeeded);

		if(itemsNeededList.contains(formattedName))

		{

		j++;

		//click on Add to cart

		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

		if(j==itemsNeeded.length)

		{

		break;

		}

		}

		}

	}

}
