import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_of_All_Vegetables_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		String text = "Harsh";
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] veg = {"Beetroot","Cucumber"};
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		ArrayList<String> prodtext = new ArrayList<String>();
		for (int i = 0 ; i< products.size();i++)
		{
			String[] m = products.get(i).getText().split("-");
			prodtext.add(m[0].trim());
		}
		System.out.println(prodtext);
		
	}

}
